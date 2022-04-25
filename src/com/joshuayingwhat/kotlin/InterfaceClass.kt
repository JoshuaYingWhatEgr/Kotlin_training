package com.joshuayingwhat.kotlin

fun main() {

}

interface moveable {

    val maxSpeed: Int
        get() = (1..500).shuffled().last()


    var wheels: Int

    fun move(moveables: moveable)

}

class InterfaceClass(override var wheels: Int) : moveable {

    override val maxSpeed: Int
        get() = super.maxSpeed

    override fun move(moveables: moveable) {
        TODO("Not yet implemented")
    }
}