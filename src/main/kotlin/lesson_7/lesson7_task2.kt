package org.example.lesson_7

fun main() {
    val range = 1000..9999

    do {
        val code = range.random()
        println("Ваш код авторизации: $code")
        println("Введите код авторизации:")

    } while (readln().toInt() != code)
    println("Здравствуйте!")
}
