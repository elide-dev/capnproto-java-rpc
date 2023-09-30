
plugins {
    id("org.capnproto.java-conventions")
    alias(libs.plugins.testlogger)
}

dependencies {
    api(projects.runtime)
    testImplementation(libs.junit)
}

description = "capnpc-java"
