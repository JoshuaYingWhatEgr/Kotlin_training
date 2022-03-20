package com.joshuayingwhat.kotlin

/**
 * kotlin min
 */
fun main() {
    //定义只读局部变量使用关键字 val 定义。只能为其赋值一次。
    //如果没有初始值类型不能省略
    val a: Int
    val b = 2
    val c: Int
    c = 3

    //可重新赋值的变量使用 var 关键字
    var d: Int

    //字符串模板
    var e = 1;

    var f = "f is $e"

    println(f)

    println("max is ${maxof(3,4)}")

    println("kotlin main")
    var sum = sum2(3, 4)
    println("print: " + sum)

    printString(3, 4)
}

// function
fun sum(a: Int, b: Int): Int {
    return a + b;
}

fun sum2(a: Int, b: Int) = a + b

/**
 * 函数返回无意义的值 Unit
 */
fun printString(a: Int, b: Int): Unit {
    println("sum of $a and $b = ${a + b}")
}

//条件表达式
//fun maxof(a:Int, b:Int):Int {
//    if(a > b) {
//        return  a
//    }else {
//        return b
//    }
//}
//if也可以用作表达式
fun maxof(a:Int,b:Int)= if(a >b) a else b
