package com.asn.kotlinmulltiplatformsample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform