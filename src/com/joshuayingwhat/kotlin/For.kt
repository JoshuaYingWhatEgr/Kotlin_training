package com.joshuayingwhat.kotlin

fun main() {

    var items = listOf("a",12,"b",13,"c")

    for(item in  items) {
        println("item = $item")
    }

    for(index in items.indices) {
        println("item = ${items[index]}")
    }
}