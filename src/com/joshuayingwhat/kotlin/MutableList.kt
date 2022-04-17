package com.joshuayingwhat.kotlin

fun main() {

    var mutableListOf = mutableListOf("1", "2", "3", "4", "5")

    mutableListOf.add("6")

    mutableListOf.forEach {
        println(it)
    }

}
