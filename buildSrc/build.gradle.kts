repositories {
    mavenCentral()
}

plugins {
    `kotlin-dsl`
}



// Set versions compatibility between Java and Kotlin.
java {
    // Can't move to Versions and use from it because importing is broken for buildSrc
    // https://github.com/gradle/gradle/issues/9270
    sourceCompatibility = JavaVersion.VERSION_16
    targetCompatibility = JavaVersion.VERSION_16
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "16"
    }
}
