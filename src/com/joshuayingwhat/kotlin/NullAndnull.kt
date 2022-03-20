package com.joshuayingwhat.kotlin

/*
空值与 null 检测

当某个变量的值可以为 null 的时候，必须在声明处的类型后添加 ? 来标识该引用可为空。
 */
fun main() {

    var i = parseInt("a")
    println("i = $i")

    var i1 = parseInt("23")
    println("i1 = $i1")
}

/**
 * ？示可以返回一个空值
 */
fun parseInt(value: String): Int? {
    return value.toIntOrNull()
}