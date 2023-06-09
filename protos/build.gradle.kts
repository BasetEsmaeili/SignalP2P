import com.google.protobuf.gradle.remove

@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.protobuf)
}

sourceSets {
    main {
        proto {
            srcDir("src/main/protobuf")
            srcDir("src/main/protocolbuffers")
            include("**/*.protodevel")
        }
    }
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:${libs.versions.protoc}"
    }

    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                remove("java")
                create("kotlin")
            }
        }
    }
}

dependencies {
    implementation(libs.protobuf.lite)
}