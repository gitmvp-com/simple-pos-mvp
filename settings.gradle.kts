pluginManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://plugins.gradle.org/m2/") }
    }
}

rootProject.name = "Simple-POS-MVP"
include(":app")
include(":data")
include(":domain")
include(":common")
