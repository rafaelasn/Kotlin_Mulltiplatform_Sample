package com.asn.kotlinmulltiplatformsample

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Faltam apenas ${daysUntilNewYear()} dias para o ano novo!"
    }
}