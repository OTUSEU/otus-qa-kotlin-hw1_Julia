plugins {
    kotlin("jvm") version "1.9.0"
}

group = "ru.otus"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.7.21")
    implementation("io.github.microutils:kotlin-logging-jvm:2.0.11")
    implementation("ch.qos.logback:logback-classic:1.2.6")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}