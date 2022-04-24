package com.joshuayingwhat.kotlin

fun main() {

    println(EnumClass.A)

    println(EnumClass.B)

    println(EnumClass.C)

    println("--------------------------------")
    println(CheckZiMu().getZiMu(EnumClass.A))
}

enum class EnumClass {
    A,
    B,
    C;
}

class CheckZiMu {

    fun getZiMu(status: EnumClass): String {
        return when (status) {
            EnumClass.A -> "A"
            EnumClass.B -> "B"
            EnumClass.C -> "C"
        }
    }
}