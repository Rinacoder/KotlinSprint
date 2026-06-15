    package org.example.lesson_7

    fun main() {
        println("Введите количество секунд:")
        val allSeconds = readln().toInt()

        for (second in allSeconds downTo 0){
            println("Осталось $second секунд")
            Thread.sleep(1000)
        }

        println("Время вышло")
    }
