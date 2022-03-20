package com.joshuayingwhat.kotlin

/**
 * kotlin min
 */
fun main() {

    println("kotlin main")
    var sum = sum2(3, 4)
    println("print: " + sum)

    printString(3, 4)
}

// function
fun sum(a: Int, b: Int): Int {
    return a + b;
}

fun sum2(a: Int, b: Int) = a + b

/**
 * 函数返回无意义的值 Unit
 */
fun printString(a: Int, b: Int): Unit {
    println("sum of $a and $b = ${a + b}")
}