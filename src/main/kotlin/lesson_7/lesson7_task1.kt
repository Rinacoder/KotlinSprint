package org.example.lesson_7

fun main() {
    val password = StringBuilder()
    val letters = 'a'..'z'
    val digits = '0'..'9'

    for (i in 1..6) {
        password.append(if (i % 2 != 0) letters.random() else digits.random())

    }

    println(password)
}
