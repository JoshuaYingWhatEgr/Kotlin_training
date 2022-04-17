package com.joshuayingwhat.kotlin

fun main() {

    var listOf = listOf("1", "2", "3", "4", "5")

    println(listOf.getOrElse(5) {"unkonw"})

    println(listOf.getOrNull(5))

    println(listOf.getOrNull(5) ?: "unkonw")

}