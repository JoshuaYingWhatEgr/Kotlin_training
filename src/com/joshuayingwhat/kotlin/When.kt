package com.joshuayingwhat.kotlin

fun main() {

    println(describe(1, "1"))

    var hasPerfix = hasPerfix(3)

    println("hasPerfix = $hasPerfix")
}

fun describe(obj: Any, s: String): Any =
    when (obj) {
        s.toIntOrNull() -> println("s encode $s")
        else -> "unknow"
    }

fun hasPerfix(x: Any) = when (x) {
    is String -> x
    else -> false
}