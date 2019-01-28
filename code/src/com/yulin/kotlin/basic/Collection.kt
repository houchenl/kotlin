package com.yulin.kotlin.basic

fun main(args: Array<String>) {
    val fruits = listOf<String>("apple", "orange", "banana", "avocado", "kiwifruit")

    // Iterating over a collection:
    for (item in fruits) {
        println(item)
    }
    println()

    // Checking if a collection contains an object using in operator:
    when {
        "orange" in fruits -> println("juicy")
        "apple" in fruits -> println("apple is fine too")
    }
    println()

    // Using lambda expressions to filter and map collections:
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }

}
