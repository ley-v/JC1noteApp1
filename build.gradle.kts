import com.android.build.gradle.internal.dsl.decorator.SupportedPropertyType.Collection.List.type

// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {

    repositories {
        google()
        mavenCentral()
    }
}
plugins {
    id("com.android.application") version "8.0.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.21" apply false

    id("com.android.library") version "8.0.1" apply false
    id("com.google.dagger.hilt.android") version "2.46.1" apply false
}



//    buildscript {
//        dependencies {
//            classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3")
//        }
//    }