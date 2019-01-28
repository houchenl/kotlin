package com.yulin.kotlin.basic

// Top-level variables:
val PI = 3.14
var x = 0

fun main(args: Array<String>) {
    val a: Int = 1    // immediate assignment
    val b = 2         // `Int` type is inferred
    val c: Int        // Type required when no initializer is provided
    c = 3             // deferred assignment
    println(a)    // 1
    println(b)    // 2
    println(c)    // 3

    // Variables that can be reassigned use the var keyword:
    var x = 5;
    x += 1
}
