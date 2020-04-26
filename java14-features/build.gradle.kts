plugins {
    java
}

group = "net.transgene.java14"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_14
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("--enable-preview")
}
