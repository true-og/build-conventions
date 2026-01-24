plugins {
    id("com.gradleup.shadow")
}

tasks.named("shadowJar") {
    setProperty("archiveClassifier", "")
    setProperty("enableRelocation", true)
    setProperty("relocationPrefix", "${project.group}.shadow")
}

tasks.named("build") {
    dependsOn("shadowJar")
}
