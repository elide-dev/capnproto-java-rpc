
plugins {
    id("org.capnproto.java-conventions")
    alias(libs.plugins.testlogger)
}

dependencies {
    testImplementation(libs.junit)
}

description = "Cap'n Proto runtime library"
