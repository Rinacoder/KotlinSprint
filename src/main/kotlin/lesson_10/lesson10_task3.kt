package org.example.lesson_10

fun main() {
    println("Введите длину пароля")
    val password = passwordGenerator(readln().toInt())
    println("Пароль: $password")
}

fun passwordGenerator(length: Int): String {
    val password = mutableListOf<String>()
    val elements = mutableListOf("!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", " ")
    for (i in 1..length) {
        when {
            i % 2 != 0 -> password.add((0..9).random().toString())
            else -> password.add((elements).random())
        }
    }
    return password.joinToString("")
}
