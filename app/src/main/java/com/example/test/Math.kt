package com.example.test

class Math {

    fun add(a: String, b: String): String {

        if (a.contains("..") or b.contains("..")) {
            return "You have entered two points!"
        }
        if (a == "" || b == "") {
            return "You have not filled in the fields!"
        }

        return try {
            if (a.contains(".") or b.contains(".")) {
                var result = (a.replace(" ","").toDouble() + b.replace(" ","").toDouble()).toString()
                if (result.toDouble() % 1 > 0.0) {
                    result
                } else {
                    result.replace(".0", "")
                }
            } else {
                (a.replace(" ","").toInt() + b.replace(" ","").toInt()).toString()
            }
        } catch (ex: Exception) {
            "Incorrect input!"
        }
    }

    fun divide(a: String, b: String): String {
        return if (b == "0") {
            "Can't divide by zero!"
        } else {
            (a.toInt() / b.toInt()).toString()
        }
    }
}