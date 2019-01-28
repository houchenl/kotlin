package com.yulin.kotlin.basic

fun main(args: Array<String>) {
//    println(describe(3.1))
    range()
}

// Using when expression
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }

// Using range
fun range() {
    // Check if a number is within a range using in operator:
    var x = 9
    var y = 10
    if (y in 1..x+1) {
        println("$y fit in range")
    }

    var list = listOf<String>("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size if out of valid list indices range, too")
    }

    // Iterating over a range:
    for (x in 1..5) {
        println(x)
    }
    println()
    for (x in 1..10 step 2) {
        println(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        println(x)
    }
}
