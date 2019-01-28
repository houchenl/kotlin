package com.yulin.kotlin.basic

//// functions

// Function having two Int parameters with Int return type:
fun sum(a: Int, b: Int): Int {
    return a + b
}

// Function with an expression body and inferred return type:
fun sum2(a: Int, b: Int) = a + b

// Function returning no meaningful value:
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// Unit return type can be omitted:
fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

// Using conditional expressions
fun maxOf2(a: Int, b: Int) = if (a > b) a else b
