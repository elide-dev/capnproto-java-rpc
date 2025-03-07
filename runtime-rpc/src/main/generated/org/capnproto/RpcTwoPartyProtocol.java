// Generated by Cap'n Proto compiler, DO NOT EDIT
// source: rpc-twoparty.capnp

package org.capnproto;

public final class RpcTwoPartyProtocol {
  public enum Side {
    SERVER,
    CLIENT,
    _NOT_IN_SCHEMA,
  }

  public static class VatId {
    public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)1,(short)0);
    public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
      public Factory() {
      }
      public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
        return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
      }
      public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
        return new Builder(segment, data, pointers, dataSize, pointerCount);
      }
      public final org.capnproto.StructSize structSize() {
        return VatId.STRUCT_SIZE;
      }
      public final Reader asReader(Builder builder) {
        return builder.asReader();
      }
    }
    public static final Factory factory = new Factory();
    public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
      new org.capnproto.StructList.Factory<Builder, Reader>(factory);
    public static final class Builder extends org.capnproto.StructBuilder {
      Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
        super(segment, data, pointers, dataSize, pointerCount);
      }
      public final Reader asReader() {
        return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
      }
      public final org.capnproto.RpcTwoPartyProtocol.Side getSide() {
        switch(_getShortField(0)) {
          case 0 : return org.capnproto.RpcTwoPartyProtocol.Side.SERVER;
          case 1 : return org.capnproto.RpcTwoPartyProtocol.Side.CLIENT;
          default: return org.capnproto.RpcTwoPartyProtocol.Side._NOT_IN_SCHEMA;
        }
      }
      public final void setSide(org.capnproto.RpcTwoPartyProtocol.Side value) {
        _setShortField(0, (short)value.ordinal());
      }

    }

    public static final class Reader extends org.capnproto.StructReader {
      Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
        super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
      }

      public final org.capnproto.RpcTwoPartyProtocol.Side getSide() {
        switch(_getShortField(0)) {
          case 0 : return org.capnproto.RpcTwoPartyProtocol.Side.SERVER;
          case 1 : return org.capnproto.RpcTwoPartyProtocol.Side.CLIENT;
          default: return org.capnproto.RpcTwoPartyProtocol.Side._NOT_IN_SCHEMA;
        }
      }

    }

  }
  public static class ProvisionId {
    public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)1,(short)0);
    public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
      public Factory() {
      }
      public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
        return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
      }
      public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
        return new Builder(segment, data, pointers, dataSize, pointerCount);
      }
      public final org.capnproto.StructSize structSize() {
        return ProvisionId.STRUCT_SIZE;
      }
      public final Reader asReader(Builder builder) {
        return builder.asReader();
      }
    }
    public static final Factory factory = new Factory();
    public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
      new org.capnproto.StructList.Factory<Builder, Reader>(factory);
    public static final class Builder extends org.capnproto.StructBuilder {
      Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
        super(segment, data, pointers, dataSize, pointerCount);
      }
      public final Reader asReader() {
        return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
      }
      public final int getJoinId() {
        return _getIntField(0);
      }
      public final void setJoinId(int value) {
        _setIntField(0, value);
      }

    }

    public static final class Reader extends org.capnproto.StructReader {
      Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
        super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
      }

      public final int getJoinId() {
        return _getIntField(0);
      }

    }

  }
  public static class RecipientId {
    public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)0,(short)0);
    public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
      public Factory() {
      }
      public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
        return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
      }
      public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
        return new Builder(segment, data, pointers, dataSize, pointerCount);
      }
      public final org.capnproto.StructSize structSize() {
        return RecipientId.STRUCT_SIZE;
      }
      public final Reader asReader(Builder builder) {
        return builder.asReader();
      }
    }
    public static final Factory factory = new Factory();
    public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
      new org.capnproto.StructList.Factory<Builder, Reader>(factory);
    public static final class Builder extends org.capnproto.StructBuilder {
      Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
        super(segment, data, pointers, dataSize, pointerCount);
      }
      public final Reader asReader() {
        return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
      }
    }

    public static final class Reader extends org.capnproto.StructReader {
      Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
        super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
      }

    }

  }
  public static class ThirdPartyCapId {
    public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)0,(short)0);
    public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
      public Factory() {
      }
      public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
        return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
      }
      public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
        return new Builder(segment, data, pointers, dataSize, pointerCount);
      }
      public final org.capnproto.StructSize structSize() {
        return ThirdPartyCapId.STRUCT_SIZE;
      }
      public final Reader asReader(Builder builder) {
        return builder.asReader();
      }
    }
    public static final Factory factory = new Factory();
    public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
      new org.capnproto.StructList.Factory<Builder, Reader>(factory);
    public static final class Builder extends org.capnproto.StructBuilder {
      Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
        super(segment, data, pointers, dataSize, pointerCount);
      }
      public final Reader asReader() {
        return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
      }
    }

    public static final class Reader extends org.capnproto.StructReader {
      Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
        super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
      }

    }

  }
  public static class JoinKeyPart {
    public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)1,(short)0);
    public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
      public Factory() {
      }
      public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
        return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
      }
      public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
        return new Builder(segment, data, pointers, dataSize, pointerCount);
      }
      public final org.capnproto.StructSize structSize() {
        return JoinKeyPart.STRUCT_SIZE;
      }
      public final Reader asReader(Builder builder) {
        return builder.asReader();
      }
    }
    public static final Factory factory = new Factory();
    public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
      new org.capnproto.StructList.Factory<Builder, Reader>(factory);
    public static final class Builder extends org.capnproto.StructBuilder {
      Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
        super(segment, data, pointers, dataSize, pointerCount);
      }
      public final Reader asReader() {
        return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
      }
      public final int getJoinId() {
        return _getIntField(0);
      }
      public final void setJoinId(int value) {
        _setIntField(0, value);
      }

      public final short getPartCount() {
        return _getShortField(2);
      }
      public final void setPartCount(short value) {
        _setShortField(2, value);
      }

      public final short getPartNum() {
        return _getShortField(3);
      }
      public final void setPartNum(short value) {
        _setShortField(3, value);
      }

    }

    public static final class Reader extends org.capnproto.StructReader {
      Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
        super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
      }

      public final int getJoinId() {
        return _getIntField(0);
      }

      public final short getPartCount() {
        return _getShortField(2);
      }

      public final short getPartNum() {
        return _getShortField(3);
      }

    }

  }
  public static class JoinResult {
    public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)1,(short)1);
    public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
      public Factory() {
      }
      public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
        return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
      }
      public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
        return new Builder(segment, data, pointers, dataSize, pointerCount);
      }
      public final org.capnproto.StructSize structSize() {
        return JoinResult.STRUCT_SIZE;
      }
      public final Reader asReader(Builder builder) {
        return builder.asReader();
      }
    }
    public static final Factory factory = new Factory();
    public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
      new org.capnproto.StructList.Factory<Builder, Reader>(factory);
    public static final class Builder extends org.capnproto.StructBuilder {
      Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
        super(segment, data, pointers, dataSize, pointerCount);
      }
      public final Reader asReader() {
        return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
      }
      public final int getJoinId() {
        return _getIntField(0);
      }
      public final void setJoinId(int value) {
        _setIntField(0, value);
      }

      public final boolean getSucceeded() {
        return _getBooleanField(32);
      }
      public final void setSucceeded(boolean value) {
        _setBooleanField(32, value);
      }

      public final boolean hasCap() {
        return !_pointerFieldIsNull(0);
      }
      public org.capnproto.AnyPointer.Builder getCap() {
        return _getPointerField(org.capnproto.AnyPointer.factory, 0);
      }
      public org.capnproto.AnyPointer.Builder initCap() {
        return _initPointerField(org.capnproto.AnyPointer.factory, 0, 0);
      }
      public org.capnproto.AnyPointer.Builder initCap(int size) {
        return _initPointerField(org.capnproto.AnyPointer.factory, 0, size);
      }

    }

    public static final class Reader extends org.capnproto.StructReader {
      Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
        super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
      }

      public final int getJoinId() {
        return _getIntField(0);
      }

      public final boolean getSucceeded() {
        return _getBooleanField(32);
      }

      public boolean hasCap() {
        return !_pointerFieldIsNull(0);
      }
      public org.capnproto.AnyPointer.Reader getCap() {
        return _getPointerField(org.capnproto.AnyPointer.factory, 0);
      }
    }

  }

public static final class Schemas {
public static final org.capnproto.SegmentReader b_9fd69ebc87b9719c =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u009c\u0071\u00b9\u0087\u00bc\u009e\u00d6\u009f" +
   "\u0013\u0000\u0000\u0000\u0002\u0000\u0000\u0000" +
   "\u00a1\u00f2\u00da\\\u0088\u00c7\u0084\u00a1" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u00c2\u0000\u0000\u0000" +
   "\u001d\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0019\u0000\u0000\u0000\u0037\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0072\u0070\u0063\u002d\u0074\u0077\u006f\u0070" +
   "\u0061\u0072\u0074\u0079\u002e\u0063\u0061\u0070" +
   "\u006e\u0070\u003a\u0053\u0069\u0064\u0065\u0000" +
   "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u0008\u0000\u0000\u0000\u0001\u0000\u0002\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0011\u0000\u0000\u0000\u003a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0009\u0000\u0000\u0000\u003a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0073\u0065\u0072\u0076\u0065\u0072\u0000\u0000" +
   "\u0063\u006c\u0069\u0065\u006e\u0074\u0000\u0000" + "");
public static final org.capnproto.SegmentReader b_d20b909fee733a8e =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u008e\u003a\u0073\u00ee\u009f\u0090\u000b\u00d2" +
   "\u0013\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u00a1\u00f2\u00da\\\u0088\u00c7\u0084\u00a1" +
   "\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u00ca\u0000\u0000\u0000" +
   "\u0021\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u001d\u0000\u0000\u0000\u003f\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0072\u0070\u0063\u002d\u0074\u0077\u006f\u0070" +
   "\u0061\u0072\u0074\u0079\u002e\u0063\u0061\u0070" +
   "\u006e\u0070\u003a\u0056\u0061\u0074\u0049\u0064" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\r\u0000\u0000\u0000\u002a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0008\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0014\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0073\u0069\u0064\u0065\u0000\u0000\u0000\u0000" +
   "\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u009c\u0071\u00b9\u0087\u00bc\u009e\u00d6\u009f" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
public static final org.capnproto.SegmentReader b_b88d09a9c5f39817 =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u0017\u0098\u00f3\u00c5\u00a9\u0009\u008d\u00b8" +
   "\u0013\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u00a1\u00f2\u00da\\\u0088\u00c7\u0084\u00a1" +
   "\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u00fa\u0000\u0000\u0000" +
   "\u0021\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u001d\u0000\u0000\u0000\u003f\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0072\u0070\u0063\u002d\u0074\u0077\u006f\u0070" +
   "\u0061\u0072\u0074\u0079\u002e\u0063\u0061\u0070" +
   "\u006e\u0070\u003a\u0050\u0072\u006f\u0076\u0069" +
   "\u0073\u0069\u006f\u006e\u0049\u0064\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\r\u0000\u0000\u0000\u003a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0008\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0014\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u006a\u006f\u0069\u006e\u0049\u0064\u0000\u0000" +
   "\u0008\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0008\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
public static final org.capnproto.SegmentReader b_89f389b6fd4082c1 =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u00c1\u0082\u0040\u00fd\u00b6\u0089\u00f3\u0089" +
   "\u0013\u0000\u0000\u0000\u0001\u0000\u0000\u0000" +
   "\u00a1\u00f2\u00da\\\u0088\u00c7\u0084\u00a1" +
   "\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u00fa\u0000\u0000\u0000" +
   "\u0021\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0072\u0070\u0063\u002d\u0074\u0077\u006f\u0070" +
   "\u0061\u0072\u0074\u0079\u002e\u0063\u0061\u0070" +
   "\u006e\u0070\u003a\u0052\u0065\u0063\u0069\u0070" +
   "\u0069\u0065\u006e\u0074\u0049\u0064\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" + "");
public static final org.capnproto.SegmentReader b_b47f4979672cb59d =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u009d\u00b5\u002c\u0067\u0079\u0049\u007f\u00b4" +
   "\u0013\u0000\u0000\u0000\u0001\u0000\u0000\u0000" +
   "\u00a1\u00f2\u00da\\\u0088\u00c7\u0084\u00a1" +
   "\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u001a\u0001\u0000\u0000" +
   "\u0025\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0072\u0070\u0063\u002d\u0074\u0077\u006f\u0070" +
   "\u0061\u0072\u0074\u0079\u002e\u0063\u0061\u0070" +
   "\u006e\u0070\u003a\u0054\u0068\u0069\u0072\u0064" +
   "\u0050\u0061\u0072\u0074\u0079\u0043\u0061\u0070" +
   "\u0049\u0064\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" + "");
public static final org.capnproto.SegmentReader b_95b29059097fca83 =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u0083\u00ca\u007f\u0009\u0059\u0090\u00b2\u0095" +
   "\u0013\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u00a1\u00f2\u00da\\\u0088\u00c7\u0084\u00a1" +
   "\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u00fa\u0000\u0000\u0000" +
   "\u0021\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u001d\u0000\u0000\u0000\u00af\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0072\u0070\u0063\u002d\u0074\u0077\u006f\u0070" +
   "\u0061\u0072\u0074\u0079\u002e\u0063\u0061\u0070" +
   "\u006e\u0070\u003a\u004a\u006f\u0069\u006e\u004b" +
   "\u0065\u0079\u0050\u0061\u0072\u0074\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u000c\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0045\u0000\u0000\u0000\u003a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0040\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u004c\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0049\u0000\u0000\u0000\u0052\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0048\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0054\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0002\u0000\u0000\u0000\u0003\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0051\u0000\u0000\u0000\u0042\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u004c\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0058\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u006a\u006f\u0069\u006e\u0049\u0064\u0000\u0000" +
   "\u0008\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0008\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0070\u0061\u0072\u0074\u0043\u006f\u0075\u006e" +
   "\u0074\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0070\u0061\u0072\u0074\u004e\u0075\u006d\u0000" +
   "\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
public static final org.capnproto.SegmentReader b_9d263a3630b7ebee =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u00ee\u00eb\u00b7\u0030\u0036\u003a\u0026\u009d" +
   "\u0013\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u00a1\u00f2\u00da\\\u0088\u00c7\u0084\u00a1" +
   "\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u00f2\u0000\u0000\u0000" +
   "\u0021\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u001d\u0000\u0000\u0000\u00af\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0072\u0070\u0063\u002d\u0074\u0077\u006f\u0070" +
   "\u0061\u0072\u0074\u0079\u002e\u0063\u0061\u0070" +
   "\u006e\u0070\u003a\u004a\u006f\u0069\u006e\u0052" +
   "\u0065\u0073\u0075\u006c\u0074\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u000c\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0045\u0000\u0000\u0000\u003a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0040\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u004c\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0001\u0000\u0000\u0000\u0020\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0049\u0000\u0000\u0000\u0052\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0048\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0054\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0051\u0000\u0000\u0000\"\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u004c\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0058\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u006a\u006f\u0069\u006e\u0049\u0064\u0000\u0000" +
   "\u0008\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0008\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0073\u0075\u0063\u0063\u0065\u0065\u0064\u0065" +
   "\u0064\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0063\u0061\u0070\u0000\u0000\u0000\u0000\u0000" +
   "\u0012\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0012\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
}
}

