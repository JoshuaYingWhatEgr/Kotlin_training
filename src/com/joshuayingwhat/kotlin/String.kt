package com.joshuayingwhat.kotlin

fun main() {

    var str = "abcdefg"
    str.forEach { println("it ---> $it") }

    println(str[0])

    var s = "23435"+123

    println("s === $s")

    var  str1 = "jack,mark,tommy"

    var (o1:String,o2:String,o3:String) = str1.split(",")

    println("$o1 $o2 $o3")



}