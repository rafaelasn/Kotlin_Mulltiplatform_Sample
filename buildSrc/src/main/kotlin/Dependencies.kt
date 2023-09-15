object Versions {
    const val koin = "3.2.0"
    const val coroutinesVersion = "1.7.3"
    const val serializationVersion = "1.6.0"
    const val ktorVersion = "2.3.4"
}

object Deps {

    object Koin {
        const val core = "io.insert-koin:koin-core:${Versions.koin}"
        const val test = "io.insert-koin:koin-test:${Versions.koin}"
        const val android = "io.insert-koin:koin-android:${Versions.koin}"
    }

    const val coroutinesDependency = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"

    const val kotlinSerializationDependency = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.serializationVersion}"

    const val ktorDependency = "io.ktor:ktor-client-core:${Versions.ktorVersion}"
    const val ktorClientNegotiationDependency = "io.ktor:ktor-client-content-negotiation:${Versions.ktorVersion}"
    const val ktorSerializationDependency = "io.ktor:ktor-serialization-kotlinx-json:${Versions.ktorVersion}"

    const val ktorAndroidDependency = "io.ktor:ktor-client-android:${Versions.ktorVersion}"

    const val ktorIOSDependency = "io.ktor:ktor-client-darwin:${Versions.ktorVersion}"
}