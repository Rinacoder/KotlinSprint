package org.example.lesson_7

fun main() {
    println("Введите длину пароля не меньше 6")
    val length = readln().toInt()
    val password = StringBuilder()
    val lowercase = 'a'..'z'
    val uppercase = 'A'..'Z'
    val digits = '0'..'9'
    var range: IntRange

    if (length >= 6) {
        range = 1..length
    } else {
        range = 1..6
    }
    for (i in range) {
        when ((0..2).random()) {
            0 -> password.append(lowercase.random())
            1 -> password.append(uppercase.random())
            2 -> password.append(digits.random())
        }
    }
    println(password)
}
