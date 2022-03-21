package com.joshuayingwhat.kotlin

fun main() {

    var items = listOf("a",12,"b",13,"c")

    for(item in  items) {
        println("item = $item")
    }

    for(index in items.indices) {
        println("item = ${items[index]}")
    }

    var ints = arrayOf(1, 2, 3, 4)

    for((index,value) in ints.withIndex()) {
        println("the element index = $index  value = $value")
    }
}