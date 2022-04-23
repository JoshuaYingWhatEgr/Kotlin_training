package com.joshuayingwhat.kotlin

fun main() {

//    var loading = ObjectClass.loading()
//
//    println(loading)


    val p = object : clazz() {

        override fun loading() = "clazz loading..."
    }

    println(p.loading())
}

open class clazz {

    open fun loading() = "loading..."
}

//object ObjectClass {
//
//    fun loading() = "objectclass loading..."
//}