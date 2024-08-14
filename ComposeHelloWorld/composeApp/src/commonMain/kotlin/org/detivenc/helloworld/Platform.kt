package org.detivenc.helloworld

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform