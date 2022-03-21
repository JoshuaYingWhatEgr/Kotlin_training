package com.joshuayingwhat.kotlin

/**
 * 使用 in 运算符来检测某个数字是否在指定区间内：
 */
fun main() {

    RangeIn(0)

    //区间迭代
    for(value in 1..10) {
        println(value)
    }

    //数列迭代
    for(value in 1..10 step 13) {
        println("value = $value")
    }

    for(value in 10 downTo 1 step 10) {
        println("value is $value")
    }
}

fun RangeIn(value:Int) {

    if(value in  1..10) {

        println("value is $value")
    }
}