plugins {
    id ("com.android.application")
    id ("kotlin-android")
    kotlin("kapt")
}



android {
    compileSdkVersion (30)
    buildToolsVersion ("30.0.2")

    defaultConfig {
        applicationId ("com.iconic_dev.retrofitcall")
        minSdkVersion (21)
        targetSdkVersion (30)
        versionCode (1)
        versionName ("1.0")

        testInstrumentationRunner ("androidx.test.runner.AndroidJUnitRunner")
    }

    buildTypes {
        getByName("release"){
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"

            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation (Libs.Kotlin.stdlib)
    implementation (Libs.Kotlin.core)
    implementation (Libs.Android.appCompat)
    implementation (Libs.Android.material)
    implementation (Libs.Android.constraintLayout)
    testImplementation (Libs.JUnit.junit4)
    androidTestImplementation ( Libs.JUnit.junit)
    androidTestImplementation (Libs.Android.espresso)
    api (Libs.Gson.gson)
    api (Libs.OkHttp.okhttp)
    api (Libs.OkHttp.loggingInterceptor)
    api (Libs.Retrofit.retrofit)
    api (Libs.Retrofit.gsonConverter)
}