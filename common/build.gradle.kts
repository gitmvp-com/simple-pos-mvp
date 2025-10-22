plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    namespace = "com.gitmvp.common"
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        minSdk = AppConfig.minSdk
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = AppConfig.jvmTarget
    }
}

dependencies {
    api("androidx.core:core-ktx:${Dependencies.kotlinCoreVersion}")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-android:${Dependencies.kotlinCoroutineVersion}")

    // Hilt
    implementation("com.google.dagger:hilt-android:${Dependencies.hiltVersion}")
    kapt("com.google.dagger:hilt-compiler:${Dependencies.hiltVersion}")
}
