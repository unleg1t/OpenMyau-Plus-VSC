pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://oss.sonatype.org/content/repositories/snapshots")
        maven("https://maven.architectury.dev/")
        maven("https://maven.fabricmc.net")
        maven("https://maven.minecraftforge.net/")
        maven("https://repo.spongepowered.org/maven/")
    }
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "dev.architectury.loom" -> useModule("dev.architectury:architectury-loom:${requested.version}")
            }
        }
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.6.0")
}
rootProject.name = "myau"
