plugins {
    id("com.android.application") version AppPlugins.androidApplication apply false
    id("com.android.library") version AppPlugins.androidLibrary apply false
    id("com.google.dagger.hilt.android") version AppPlugins.hilt apply false
    id("org.jetbrains.kotlin.android") version AppPlugins.kotlin apply false
    id("com.google.devtools.ksp") version AppPlugins.ksp apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.create<Delete>("clean") {
    delete {
        rootProject.buildDir
    }
}
