
plugins {
    id("org.capnproto.java-conventions")
    alias(libs.plugins.testlogger)
}

dependencies {
    api(projects.runtime)
    api(projects.compiler)
    testImplementation(libs.junit)
}

description = "Cap'n Proto RPC runtime library"
