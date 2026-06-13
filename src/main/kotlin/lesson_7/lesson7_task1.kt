package org.example.lesson_7

fun main() {
    val password = StringBuilder()

    for (i in 1..6) {
        if (i % 2 != 0) {
            password.append(('a'..'z').random())
        } else {
            password.append(('0'..'9').random())
        }
    }

    println(password)
}
