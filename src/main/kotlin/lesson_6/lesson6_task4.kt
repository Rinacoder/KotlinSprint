package org.example.lesson_6

fun main() {
    val secret = (1..9).random()
    var numberAttempts = 5
    while (numberAttempts > 0) {
        println("Введите число от 1 до 9")
        if (readln().toInt() == secret) {
            println("Это была великолепная игра!")
            break
        }
        numberAttempts--
        if (numberAttempts > 0) {
            println("Неверно! Попробуйте еще раз!")
        } else {
            println("К сожалению вы не угадали!")
        }

    }
}