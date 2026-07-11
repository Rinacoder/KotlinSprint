package org.example.lesson_10

fun main() {
    println("Введите длину пароля")
    val password = generatePassword(readln().toInt())
    println("Пароль: $password")
}

fun generatePassword(length: Int): String {
    val password = mutableListOf<String>()
    for (i in 1..length) {
        when {
            i % 2 != 0 -> password.add((0..9).random().toString())
            else -> password.add((' '..'/').random().toString())
        }
    }
    return password.joinToString("")
}
