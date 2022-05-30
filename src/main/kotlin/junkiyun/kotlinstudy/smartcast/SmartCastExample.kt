package junkiyun.kotlinstudy.smartcast

import org.springframework.web.client.RestClientResponseException

fun classifyException(e: Exception) {
    if (e is RestClientResponseException) {
        println(e.rawStatusCode)
    } else {
        println("others")
    }
}