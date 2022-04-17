package com.joshuayingwhat.kotlin

fun main() {

    var student = Student("jack")

}

class Student(_name: String, var _age: Int = 20) {

    constructor(_name: String) : this(_name, _age = 20) {

        println("constructor")

        var name = _name
    }

    init {

        println("Initialzing init")

//        score = 10
    }

    var name = _name

    var sex: String = "nan"

//    var score: Int
}