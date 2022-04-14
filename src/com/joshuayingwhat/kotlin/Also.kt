package com.joshuayingwhat.kotlin

fun main() {

    var Also:String? = null

    var also = "sdasda".also {
    }

    println(also)

    var apply = "adasdas".apply {
        this.capitalize()
    }

    println(apply)

    var apply1  = "dasdas".run {
        this.capitalize()
    }

    println(apply1)
}