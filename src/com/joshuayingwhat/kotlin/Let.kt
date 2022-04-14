package com.joshuayingwhat.kotlin

fun main() {


    var list = listOf(3, 2, 1).first().let {
        it * it
    }

    println(list)

    println(formatString(null))

    var let = "wdqdqwd".let {
        it.capitalize()
        "dwdq"
    }


    println(let)

    var run = "dqwdqwd".run {
        this.capitalize()
        "dxwqdw"
    }

    println(run)
}

fun formatString(guest:String?): String {

    return guest?.let {
        "welcome, $it"
    } ?: "what is you name"
}