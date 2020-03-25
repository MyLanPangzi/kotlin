package com.hiscat.kt.basic

fun desc(obj: Any): String =
        when (obj) {
            1 -> "One"
            "hello" -> "greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }
fun main() {
    println(desc(1))
    println(desc("hello"))
    println(desc(1L))
    println(desc(1F))
}