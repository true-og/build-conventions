plugins {
    id("com.gradleup.shadow")
}

tasks.shadowJar {
    archiveClassifier.set("") // Use empty string instead of null.
    isEnableRelocation = true
    relocationPrefix = "${project.group}.shadow"
}

tasks.build { dependsOn(tasks.shadowJar) }