package com.joshuayingwhat.kotlin

fun main() {

    var initClass = InitClass("jack", 0)

    println(initClass)
}

class InitClass(_name: String, var age: Int = 20) {


    init {
        require(_name.isNotBlank()) { "name must not blank " }

        require(age > 10) { "age must > 10" }

        println("_name = $_name ,age = $age")
    }

    var name = _name

}