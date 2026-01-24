plugins {
    // Apply Spotless to the target project
    id("com.diffplug.spotless")
}

spotless {
    kotlin {
        ktfmt().kotlinlangStyle().configure {
            it.setMaxWidth(120)
            it.setRemoveUnusedImports(true)
        } // JetBrains Kotlin formatting.
    }
    kotlinGradle {
        ktfmt().kotlinlangStyle().configure {
            it.setMaxWidth(120)
            it.setRemoveUnusedImports(true)
        } // JetBrains Kotlin formatting.
        target("build.gradle.kts", "settings.gradle.kts") // Gradle files to format.
    }
    java {
        eclipse().configFile("config/formatter/eclipse-java-formatter.xml") // Eclipse java formatting.
        leadingTabsToSpaces() // Convert leftover leading tabs to spaces.
        removeUnusedImports() // Remove imports that aren't being called.
    }
}

tasks.build { dependsOn(tasks.spotlessApply) }

tasks.named("spotlessCheck") {
    dependsOn("spotlessApply") // Run spotless before checking if spotless ran.
}
