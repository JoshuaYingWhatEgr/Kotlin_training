package com.joshuayingwhat.kotlin

fun main() {
    var people = People("joshuayingwhat", 20, "nan")

    people.name = "hello    "

    println(people.name)
}

class People(_name: String, _age: Int, _sex: String) {

    var name = _name
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }

    var age = _age

    var sex = _sex;
}