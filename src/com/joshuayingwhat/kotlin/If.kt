package com.joshuayingwhat.kotlin

fun main() {

    var max = if (4 <= 5) {
        5
    } else {
        4
    }
    println("max = $max")

    //if 的分支可以是代码块，最后的表达式作为该块的值

    var maxValue = if (4 > 5) {
        println("maxValue = ")
        4
    } else {
        println("maxValue = ")
        5
    }
    println(maxValue)
}