plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17


}
dependencies {
    implementation(kotlin("stdlib"))
    implementation(libs.kotlinx.coroutines.android)
    // Koin
    implementation(libs.koin.core)

}