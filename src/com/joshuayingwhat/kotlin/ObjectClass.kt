package com.joshuayingwhat.kotlin

fun main() {

    val p = object : clazz() {

        override fun loading() = "clazz loading..."
    }

    println(p)
    println(p)

    ObjectClass.doSometing()
}

open class clazz {

    open fun loading() = "loading..."
}

object ObjectClass  {

    fun doSometing() {

    }
}