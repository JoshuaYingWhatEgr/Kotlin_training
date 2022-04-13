package com.joshuayingwhat.kotlin

fun main() {

    var str = "asd23"

    var let = str.let {
        if (it.length > 5) {
            println(it)
            it.length
        } else {
            it.length
        }
    }

    println(let)

// str = null

    var str1: String? = null

    println(str1?.capitalize())

    println(str1 ?: "jack")

    println(str1!!.capitalize())
}