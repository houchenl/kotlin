package com.yulin.kotlin.basic

fun main(args: Array<String>) {
    printProduct("x", "5")
}

// A reference must be explicitly marked as nullable when null value is possible.
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

// Use a function returning nullable value:
fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x == null) {
        println("Wrong number format in arg1: '$x'")
        return
    }

    if (y == null) {
        println("Wrong number format in arg2: '$y'")
        return
    }

    println(x * y)
}
