package com.hiscat.kt.basic

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}
fun main() {
    println(getStringLength("a"))
    println(getStringLength(1))
}