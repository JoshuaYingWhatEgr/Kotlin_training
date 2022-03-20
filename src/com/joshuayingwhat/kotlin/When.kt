package com.joshuayingwhat.kotlin

fun main() {

    println(describe("dxx"))

}

fun describe(obj: Any):Any =
    when (obj) {
        1 -> 1
        "hello" -> "hello"
        0 -> 0
        else -> "unknow"
    }