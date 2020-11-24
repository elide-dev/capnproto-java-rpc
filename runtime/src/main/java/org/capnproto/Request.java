package org.capnproto;

import java.util.concurrent.CompletableFuture;

public interface Request<Params> {

    FromPointerBuilder<Params> getParamsFactory();

    Request<AnyPointer.Builder> getTypelessRequest();

    default Params getParams() {
        return this.getTypelessRequest().getParams().getAs(this.getParamsFactory());
    }

    default RequestHook getHook() {
        return this.getTypelessRequest().getHook();
    }


    default RemotePromise<AnyPointer.Reader> sendInternal() {
        return this.getTypelessRequest().sendInternal();
    }

    static <Params> Request<Params> newBrokenRequest(FromPointerBuilder<Params> paramsFactory,
                                                     Throwable exc) {

        var message = new MessageBuilder();

        var hook = new RequestHook() {
            @Override
            public RemotePromise<AnyPointer.Reader> send() {
                return new RemotePromise<>(CompletableFuture.failedFuture(exc),
                        new AnyPointer.Pipeline(PipelineHook.newBrokenPipeline(exc)));
            }

            @Override
            public CompletableFuture<?> sendStreaming() {
                return CompletableFuture.failedFuture(exc);
            }
        };

        return new Request<>() {
            @Override
            public FromPointerBuilder<Params> getParamsFactory() {
                return paramsFactory;
            }

            @Override
            public Request<AnyPointer.Builder> getTypelessRequest() {
                return new AnyPointer.Request(message.getRoot(AnyPointer.factory), hook);
            }
        };
    }

    static <Params> Request<Params> fromTypeless(
            FromPointerBuilder<Params> paramsFactory,
            Request<AnyPointer.Builder> typeless) {
        return new Request<>() {
            @Override
            public FromPointerBuilder<Params> getParamsFactory() {
                return paramsFactory;
            }

            @Override
            public Request<AnyPointer.Builder> getTypelessRequest() {
                return typeless;
            }
        };
    }
}
