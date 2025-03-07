package org.capnproto;

import java.nio.channels.AsynchronousByteChannel;
import java.util.concurrent.CompletableFuture;

public class TwoPartyClient {

    private final TwoPartyVatNetwork network;
    private final RpcSystem<RpcTwoPartyProtocol.VatId.Reader> rpcSystem;

    public TwoPartyClient(AsynchronousByteChannel channel) {
        this(channel, null);
    }

    public TwoPartyClient(AsynchronousByteChannel channel, Capability.Client bootstrapInterface) {
        this(channel, bootstrapInterface, RpcTwoPartyProtocol.Side.CLIENT);
    }

    public TwoPartyClient(AsynchronousByteChannel channel,
                          Capability.Client bootstrapInterface,
                          RpcTwoPartyProtocol.Side side) {
        this.network = new TwoPartyVatNetwork(channel, side);
        this.rpcSystem = new RpcSystem<>(network, bootstrapInterface);
    }

    public Capability.Client bootstrap() {
        var message = new MessageBuilder();
        var vatId = message.getRoot(RpcTwoPartyProtocol.VatId.factory);
        vatId.setSide(network.getSide() == RpcTwoPartyProtocol.Side.CLIENT
                ? RpcTwoPartyProtocol.Side.SERVER
                : RpcTwoPartyProtocol.Side.CLIENT);
        return rpcSystem.bootstrap(vatId.asReader());
    }

    CompletableFuture<java.lang.Void> onDisconnect() {
        return this.network.onDisconnect();
    }

    public <T> CompletableFuture<T> runUntil(CompletableFuture<T> done) {
        while (!done.isDone()) {
            this.rpcSystem.runOnce();
        }
        return done;
    }
}
