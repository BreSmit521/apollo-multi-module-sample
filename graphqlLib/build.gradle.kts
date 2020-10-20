plugins {
    id("com.apollographql.apollo")
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdkVersion(29)

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

apollo {
    generateApolloMetadata.set(true)
    generateKotlinModels.set(true)
}

dependencies {
    implementation("com.apollographql.apollo:apollo-api:2.4.1")
}