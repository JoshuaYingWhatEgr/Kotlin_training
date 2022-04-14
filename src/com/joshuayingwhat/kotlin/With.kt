package com.joshuayingwhat.kotlin

fun main() {

    var str:String = "dwqdwq"

    var with = with(str) {
        this.capitalize()
        "12313"
    }

    println(with)
}