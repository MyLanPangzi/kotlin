package com.hiscat.kt.basic

fun main() {
    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("fits in range")
    }
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range,too")
    }
    for (i in 1..5) {
        println(i)
    }
    for (i in 1..10 step 2) {
        println(i)
    }
    println()
    for (i in 9 downTo 0 step 3) {
        println(i)
    }
}