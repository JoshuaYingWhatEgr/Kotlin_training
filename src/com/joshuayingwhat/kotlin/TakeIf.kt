package com.joshuayingwhat.kotlin

fun main() {

    var str:String? = "dsqwd"

    var capitalize = str?.takeIf {
        it.isNotBlank()
    }?.capitalize()

    println(capitalize)
}

class TakeIf {
}