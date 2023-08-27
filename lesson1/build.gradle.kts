plugins {
    kotlin("jvm") version "1.9.0"
}

group = "ru.otus"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

kotlin {
    jvmToolchain(8)
}