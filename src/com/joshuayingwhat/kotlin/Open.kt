package com.joshuayingwhat.kotlin

fun main() {

    val p = OpenClassed()

//    println(p.loading())



    if (p is OpenClass) {
        println(p.special())
    } else {

//        println(p.special())
    }

}

 open class OpenClass(var _name: String) {

    fun loading() = "loading...  $_name"

    fun special() = "openclass fun"
 }

class OpenClassed : OpenClass("wangwei") {

//    override
//    fun loading() = "loading... wangwei"
}