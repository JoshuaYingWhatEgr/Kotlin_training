package com.joshuayingwhat.kotlin

fun main() {

    var mapOf = mapOf("1" to 2, "3" to 4)

    println(mapOf)

    println(mapOf.get("3"))

    mapOf.forEach{
        println("${it.key} , ${it.value}")
    }

    mapOf.forEach{ key:String,value:Int ->

        println("$key, $value")
    }
}
