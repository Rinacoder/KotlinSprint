package org.example.lesson_7

fun main() {

    while (true) {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")
        println("Введите код авторизации:")

        if (readln().toInt() == code) {
            println("Здравствуйте!")
            break
        }

    }
}
