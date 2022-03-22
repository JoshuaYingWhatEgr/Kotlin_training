package com.joshuayingwhat.kotlin

fun main() {
    var classContructor = ClassContructor(_name = -1)

    println(classContructor.name)
}

class ClassContructor(var _name: Int?) {

    var name = _name
        get() = if (field!! < 0) -1 else _name
}