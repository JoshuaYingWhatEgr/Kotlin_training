package com.joshuayingwhat.kotlin

/**
 * 数组在 Kotlin 中使用 Array 类来表示
 */
fun main() {
    val arr = Array(5) { i -> (i * i).toString() }

    arr.forEach { it -> println("arr = ${it}") }

    var arrayOf = arrayOf(1, 2, 3)

    arrayOf.set(2, 4)
    println(arrayOf.forEach { it -> println("${it}") })

    var arrayOfNulls = arrayOfNulls<Int>(5)

    arrayOfNulls.forEach { it -> println(it) }

    val x: IntArray = intArrayOf(1, 2, 3)
    x.forEach { it -> println("${it}") }

    var intArray = IntArray(5) { it * 5 }

    intArray.forEach { it -> println("$it") }
}

fun Array() {
}