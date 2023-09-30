
plugins {
    `java-library`
    `maven-publish`
}

group = "org.capnproto"
version = "0.1.17-elide-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_20
    targetCompatibility = JavaVersion.VERSION_20
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
