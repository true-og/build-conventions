plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:8.1.0")
    implementation("com.gradleup.shadow:com.gradleup.shadow.gradle.plugin:8.3.9")
}