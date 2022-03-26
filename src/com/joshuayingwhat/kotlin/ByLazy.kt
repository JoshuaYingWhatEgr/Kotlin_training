package com.joshuayingwhat.kotlin

fun main() {

    println(ByLazy("name").string)

    println(ByLazy("name").string)
}

class ByLazy {

    constructor(name:String) {
        var _name = name
        println("name = $_name")
    }

    val string:String by lazy { showString()}

    private fun showString():String {

        println("showString:")
        return "hello"
    }


}