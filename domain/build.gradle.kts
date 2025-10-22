plugins {
    id("com.android.library")
    id("com.google.devtools.ksp")
    id("kotlin-kapt")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.gitmvp.domain"
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
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
    implementation(project(":data"))
    implementation(project(":common"))

    implementation("androidx.core:core-ktx:${Dependencies.kotlinCoreVersion}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${Dependencies.kotlinCoroutineVersion}")

    // Hilt
    implementation("com.google.dagger:hilt-android:${Dependencies.hiltVersion}")
    kapt("com.google.dagger:hilt-compiler:${Dependencies.hiltVersion}")

    // Test
    testImplementation("junit:junit:${Dependencies.junitVersion}")
    androidTestImplementation("androidx.test.ext:junit:${Dependencies.junitExtVersion}")
    androidTestImplementation("androidx.test.espresso:espresso-core:${Dependencies.espressoVersion}")
}
