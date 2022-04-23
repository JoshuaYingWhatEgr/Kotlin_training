package com.joshuayingwhat.kotlin

fun main() {

    val c1 = PlusClass(10, 10)

    val c2 = PlusClass(10, 10)

    var plusClass = c1 + c2

    println(plusClass.x)
}

data class PlusClass(var x: Int, var y: Int) {

    operator fun plus(other: PlusClass) = PlusClass(x + other.x, y + other.y)
}