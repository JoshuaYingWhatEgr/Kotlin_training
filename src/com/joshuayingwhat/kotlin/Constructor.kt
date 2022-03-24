package com.joshuayingwhat.kotlin

/**
 * 次构造函数
 */
fun main() {
    var c = Constructor("hello", 21)
}

class Constructor(_name: String) {

    private lateinit var name: String

    //Constructor的次构造函数
    constructor(_name: String, _age: Int) : this(_name) {
        this.name = _name
        println("name:$name")
    }
}