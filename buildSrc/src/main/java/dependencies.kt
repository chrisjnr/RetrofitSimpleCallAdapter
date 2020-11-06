object Libs{


    object Retrofit{
        private const val version = "2.6.0"
        private const val gsonVersion = "2.6.0"
        const val retrofit = "com.squareup.retrofit2:retrofit:$version"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:$version"
    }
    object OkHttp {
        private const val version = "4.8.0"
        const val okhttp = "com.squareup.okhttp3:okhttp:$version"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
    }

    object Kotlin {
        private const val version = "1.4.0"
        private const val coreVersion = "1.3.2"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
        const val core = "androidx.core:core-ktx:$coreVersion"
    }



    object Android{
       private const val appCompatVersion = "1.2.0"
        private const val materialVersion = "1.2.1"

        private const val espressoVersion = "3.3.0"


        private const val gradleBuildToolsVersion = "gradle:4.1.0"

        const val material = "com.google.android.material:material:$materialVersion"
        const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.3"

        const val espresso = "androidx.test.espresso:espresso-core:$espressoVersion"

        const val gradleBuildTools = "com.android.tools.build:$gradleBuildToolsVersion"

    }

    object JUnit{
        private const val version = "1.1.2"
        private const val jUnitVersion = "junit:4.+"
        const val junit = "androidx.test.ext:junit:$version"
        const val junit4 = "junit:$jUnitVersion"
    }


    object Gson{
        private const val version = "1.1.2"
        const val gson = "com.google.code.gson:$version"
    }






}
