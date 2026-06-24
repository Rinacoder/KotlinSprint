package org.example.lesson_7

fun main() {
    println("Введите число больше нуля")
    val number = readln().toInt()

    if (number > 0) {
        for (i in 0 until number step 2) {
            println(i)
        }
    } else {
        println("Введено число меньше или равное нулю")
    }
}
