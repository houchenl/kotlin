package com.yulin.kotlin.basic

fun main(args: Array<String>) {
    var a = 5
    val s1 = "a is $a"

    a = 4
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}
