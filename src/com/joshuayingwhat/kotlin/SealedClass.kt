package com.joshuayingwhat.kotlin

fun main() {

    println(StatusZiMu().getZiMu(SealedClass.C("232323")))
}

class StatusZiMu {

    fun getZiMu(status: SealedClass): String {
        return when (status) {
            is SealedClass.A -> "A"

            is SealedClass.B -> "B"

            is SealedClass.C -> "C " + "${status.statusId}"
        }
    }
}

/**
 *
 * @param
 */
sealed class SealedClass {

    object A : SealedClass()

    object B : SealedClass()

    class C(var statusId: String) : SealedClass()
}