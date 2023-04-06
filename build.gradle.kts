dependencies {
    // React, React DOM + Wrappers
    implementation(enforcedPlatform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:1.0.0-pre.354"))
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom")

    // Kotlin React Emotion (CSS)
    implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion")

    // Video Player
    implementation(npm("react-player", "2.10.1"))

    // Share Buttons
    implementation(npm("react-share", "4.4.0"))

    // Coroutines & serialization
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.3")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
}
