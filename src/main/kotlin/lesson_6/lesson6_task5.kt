package org.example.lesson_6

fun main() {
    var attempts = 3

    while (attempts > 0) {
        val a = (1..9).random()
        val b = (1..9).random()
        println("Сколько будет $a + $b?")

        if (readln().toInt() == a + b) {
            println("Добро пожаловать!")
            break
        }

        attempts--

        if (attempts > 0) {
            println("Неверно! Осталось попыток: $attempts")
            continue
        }

        println("Доступ запрещен")
    }

}
