package com.joshuayingwhat.kotlin

fun main() {
    var person = Person("joshua")

    //setInfo(String info)
    person.info = "hello"

    //getInfo()
    println(person.info)
}

class Person(_name: String) {
    var info = "info =  $_name".also(::println)

    init {
        "info = $info".also(::println)
    }

    var name = _name;

    fun show() {
        println("$name")
    }
}