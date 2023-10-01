
plugins {
    alias(libs.plugins.sonar)
}

sonar {
    properties {
        property("sonar.projectKey", "elide-dev_capnproto-java-rpc")
        property("sonar.organization", "elide-dev")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}
