package com.pguillen.portfolio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform