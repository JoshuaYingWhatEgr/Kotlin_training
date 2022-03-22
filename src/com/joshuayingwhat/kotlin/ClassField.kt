package com.joshuayingwhat.kotlin

fun main() {
    println(ClassField().info)
    println(ClassField().info2)
}

class ClassField {

    val info :String
    get() = ("dwqdwqd")


    var info2 = "xwqdqw"
    get() = ("11111111111111")
}