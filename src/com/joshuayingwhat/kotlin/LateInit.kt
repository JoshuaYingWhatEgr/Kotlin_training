package com.joshuayingwhat.kotlin

fun main() {

    var lateInit = LateInit()

    lateInit.initStrings()

    lateInit.showString()
}

class LateInit {

    lateinit var initString: String

    fun initStrings() {
        initString = "kotlin"
    }


    fun showString() {
        if (::initString.isInitialized) println("initString :  $initString")
    }
}