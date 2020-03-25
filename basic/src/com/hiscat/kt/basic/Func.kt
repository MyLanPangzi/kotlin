package com.hiscat.kt.basic

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int) = a - b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun main() {
    printSum(1, 2)
    println(sum(1, 2))
    println(sub(1, 2))
}