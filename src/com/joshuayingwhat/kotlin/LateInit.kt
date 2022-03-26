package com.joshuayingwhat.kotlin

fun main() {

    var lateInit = LateInit()

    lateInit.initString()

    lateInit.showString()
}

class LateInit {

    lateinit var initString: String

    fun initString() {
        initString = "kotlin"
    }


    fun showString() {
        println("initString :  $initString")
    }
}