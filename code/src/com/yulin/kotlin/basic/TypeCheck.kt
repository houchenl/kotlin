package com.yulin.kotlin.basic

/*
* The is operator checks if an expression is an instance of a type. If an immutable local variable or property is
* checked for a specific type, there's no need to cast it explicitly.
* */

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}

fun getStringLength2(obj: Any): Int? {
    if (obj !is String) {
        return null;
    }

    // `obj` is automatically cast to `String` in this branch
    return obj.length;
}
