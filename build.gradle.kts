plugins {
    java
    kotlin("jvm") version "2.1.20-RC"
    `maven-publish`
}

group = "com.linebeck.hyrulebattle"
version = "2.0"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/") {
        name = "papermc-repo"
    }
    maven("https://oss.sonatype.org/content/groups/public/") {
        name = "sonatype"
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")
}

val targetJavaVersion = 17
kotlin {
    jvmToolchain(targetJavaVersion)
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(targetJavaVersion))
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}

tasks.named("publishMavenJavaPublicationToMavenLocal") {
    dependsOn("jar")
}