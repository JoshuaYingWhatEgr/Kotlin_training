package com.joshuayingwhat.kotlin

/**
 * Kotlin 中的数字没有隐式拓宽转换
 * 如需将数值转换为不同的类型，使用显示转换
 */
fun main() {
    var a = 1
//    Number(1)
    Number(a.toDouble())
    var l = 1L  +3
    println(l)
}

fun Number(dobule:Double) {

    println("dobule = $dobule")
}