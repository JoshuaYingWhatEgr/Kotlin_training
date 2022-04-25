package com.joshuayingwhat.kotlin

fun main() {

    var boy: FanXingClass<Boy> = FanXingClass(Boy("Jack", 20))

    println(boy.subject)

    boy.fetch()?.run {
        println("run name $_name")
    }

    boy.fetch()?.apply {
        println("apply name $_name")
    }
}

class Boy(var _name: String, var _age: Int)

class FanXingClass<T>(item: T) {

    var isAvailable = true

    var subject: T = item

    fun fetch(): T? {
        return subject.takeIf { isAvailable }
    }
}