# capnproto-java: Cap'n Proto for Java

[![CI](https://github.com/elide-dev/capnproto-java-rpc/actions/workflows/ci.yml/badge.svg)](https://github.com/elide-dev/capnproto-java-rpc/actions/workflows/ci.yml)

[Cap'n Proto](http://capnproto.org) is an extremely efficient protocol for sharing data
and capabilities, and capnproto-java is a pure Java implementation.

[Read more here.](https://dwrensha.github.io/capnproto-java/index.html)

This repository clone adds an implementation of the RPC framework for Java.

Promise pipelining is provided via java.util.concurrent.CompletableFuture. Unlike the KJ asynchronous model, which completes promises
only when they are waited upon, a CompletableFuture can complete immediately. This may break E-ordering, as the C++ implementation
relies on kj::evalLater() to defer method calls and this implementation may have subtle differences.

Most of the C++ RPC test cases have been ported to this implementation, which gives me some comfort that the implementation logic is 
correct, but more extensive testing is required. 

This implementation does not support generic interfaces. Extending the schema compiler to output code for generic interfaces is an
exercise I leave to the reader.
