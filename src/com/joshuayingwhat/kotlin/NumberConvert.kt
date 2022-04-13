package com.joshuayingwhat.kotlin

import kotlin.math.roundToInt

fun main() {

//    val number1:Int = "8.93".toInt()

    val number2: Int? = "8.93".toIntOrNull()

    println(number2)

    var toInt = 8.95.toInt()

    println(toInt)

    var roundToInt = 8.95673.roundToInt()

    println(roundToInt)
}
