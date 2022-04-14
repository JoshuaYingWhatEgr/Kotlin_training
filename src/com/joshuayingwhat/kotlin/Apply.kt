package com.joshuayingwhat.kotlin

import java.io.File

fun main() {

    val file = File("E://wwww")

    file.setReadable(true)

    file.setWritable(true)

    file.setExecutable(true)

    val file1 = File("E://wwww").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(true)
    }
}
