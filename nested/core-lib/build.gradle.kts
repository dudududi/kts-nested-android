import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    buildToolsVersion("28.0.0")
    compileSdkVersion(28)

    defaultConfig {
        targetSdkVersion(28)
        minSdkVersion(21)
        versionCode = 1
        versionName = "1.0"
        consumerProguardFiles("proguard-rules.pro")
    }

    compileOptions {
        setSourceCompatibility(JavaVersion.VERSION_1_8)
        setTargetCompatibility(JavaVersion.VERSION_1_8)
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8", KotlinCompilerVersion.VERSION))
    implementation("androidx.appcompat:appcompat:1.0.0-beta01")
    implementation("androidx.constraintlayout:constraintlayout:1.1.2")
    implementation("com.google.android.material:material:1.0.0-beta01")
}
