
plugins {
    `java-library`
    `maven-publish`
}

group = "org.capnproto"
version = "0.1.17-elide"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks {
    test {
        maxParallelForks = 2
        jvmArgs = jvmArgs.plus(listOf("-Xmx1G"))
    }
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
        repositories {
            maven {
                name = "GitHubPackages"
                url = uri("https://maven.pkg.github.com/elide-dev/capnproto-java-rpc")
                credentials {
                    username = System.getenv("GITHUB_ACTOR")
                    password = System.getenv("GITHUB_TOKEN")
                }
            }
        }
    }
}

sourceSets {
    main {
        java {
            srcDirs("src/main/java", "src/main/generated")
        }
    }
    test {
        java {
            srcDirs("src/test/java", "src/test/generated")
        }
    }
}
