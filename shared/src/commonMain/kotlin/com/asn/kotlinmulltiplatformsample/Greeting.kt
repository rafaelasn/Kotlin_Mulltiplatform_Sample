package com.asn.kotlinmulltiplatformsample

import RocketLaunch
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class Greeting {
    private val platform: Platform = getPlatform()

    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }
    }

    suspend fun greet(): String {
        val rockets: List<RocketLaunch> =
            httpClient.get("https://api.spacexdata.com/v4/launches").body()

        val lastSuccessLaunch = rockets.last { it.launchSuccess == true }

        return "Guess what it is! > ${platform.name}!" +
                "\nThere are only ${daysUntilNewYear()} left until New Year! 🎆" +
                "\nThe last successful launch was ${lastSuccessLaunch.launchDateUTC} 🚀"
    }
}