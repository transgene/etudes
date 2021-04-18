plugins {
    java
}

group = "net.transgene.etudes"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_9
}

val jar by tasks.getting(Jar::class) {
    manifest {
        attributes["Main-Class"] = "net.transgene.etudes.java9.modules.java9.main.launch.Launcher"
    }
}