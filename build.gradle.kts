plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "ru.otus"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.9.0")
    implementation("io.github.microutils:kotlin-logging-jvm:3.0.5")
//    implementation("org.slf4j:slf4j-simple:2.0.7")
    implementation("ch.qos.logback:logback-classic:1.4.11")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}
