pluginManagement.repositories {
    mavenCentral()
    maven("https://maven.fabricmc.net/")
    gradlePluginPortal()
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

include("common", "paper", "fabric")
