package com.joshuayingwhat.kotlin

import java.io.File

fun main() {

    val file = File("E://www")

    var run = file.run {

        setReadable(true)
    }

    println(run)

    var run1 = "dwqdqsdaddsadasdasdas".run(::isLong)

    println(run1)
}

fun isLong(name:String) = name.length >=10