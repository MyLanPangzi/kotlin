package com.hiscat.kt.basic

fun main() {
    val fruits = listOf("banana", "apple", "avocado", "kiwifruit")
    for (fruit in fruits) {
        println(fruit)
    }
    when {
        "orange" in fruits -> println("juicy")
        "apple" in fruits -> println("apple is fine too")
    }
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}