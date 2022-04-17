package com.joshuayingwhat.kotlin

fun main() {

    var lazyInit = LazyInit()

    println(lazyInit.config)


    var player = Player("jack")

    println(player.name)
}

class LazyInit {

    val config by lazy { lazyConfig() }

    private fun lazyConfig(): String {
        return "config"
    }
}

class Player {

    var name: String

    constructor(_name: String) {

        name = _name
    }
}