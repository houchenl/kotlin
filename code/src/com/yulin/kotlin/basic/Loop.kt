package com.yulin.kotlin.basic

fun main(args: Array<String>) {
    val items = listOf<String>("spring", "summer", "autumn", "winter")

    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}
