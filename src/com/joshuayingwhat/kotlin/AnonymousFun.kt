package com.joshuayingwhat.kotlin

fun main() {

    var count = "missispia".count()

    var count1 = "missispia".count({ s ->
        s == 's'
    })
    println(count)
    println(count1)

    val blessingFunction: () -> String = {
        var holidy = "new year"

        "happy $holidy"
//        2*2
    }

    println(blessingFunction())

//    val blessingFunctions:(String) -> String = { name ->
//
//        var holidy = "new year"
//
//        "$name,happy $holidy"
//    }

//    val blessingFunctions: (String) -> String = {
//
//        var holidy = "new year"
//
//        "$it,happy $holidy"
//    }

//    var blessingFunctions = {
//
//        val holidy = "new year"
//
//        "happy $holidy"
//    }

    var blessingFunctions: (String, Int) -> String = { name, year ->
        val holidy = "new year"
        "$name,happy $holidy $year"
    }

    println(blessingFunctions("jack", 2027))

    var blessingFuc = { name: String, year: Int ->

        val holidy = "new year"
        "$name,happy $holidy $year"
    }
    println(blessingFuc("jack", 2027))

    var getInfo = { name: String, year: Int ->

        "$name, $year"
    }

    showOnBoard("hello", getInfo)

    showOnBoard("hello") { name: String, year: Int ->
        "$name, $year"
    }

    showOnBoard("helllo",::getDiscountWord)
}

fun getDiscountWord(goodsName: String, year: Int): String {
    return "$goodsName,$year"
}

inline fun showOnBoard(goodsName: String, getInfo: (String, Int) -> String) {
    var hour = 2027
    println(getInfo(goodsName, hour))
}