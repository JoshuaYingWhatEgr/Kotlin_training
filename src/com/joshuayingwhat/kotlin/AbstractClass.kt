package com.joshuayingwhat.kotlin

fun main() {

    var value = object : sds() {

        override fun move() {
            super.move()
        }

        override fun movs() {
            super.movs()
        }
    }

    println(value.movs())
}

open class sds : AbstraceClass() {
    override fun move() {

    }
}

abstract class AbstraceClass {

    abstract fun move()

    open fun movs() {
        println("movs...")
    }
}