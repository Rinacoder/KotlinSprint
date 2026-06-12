package org.example.lesson_6

fun main() {
    println("Введите количество секунд:")
    val remainingSeconds = readln().toInt()
    var count = remainingSeconds
    while (count > 0) {
        Thread.sleep(1000)
        count--
    }
    println("Прошло $remainingSeconds секунд")
}