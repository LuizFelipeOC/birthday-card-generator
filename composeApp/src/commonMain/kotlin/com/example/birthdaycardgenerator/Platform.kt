package com.example.birthdaycardgenerator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform