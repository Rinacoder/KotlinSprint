package org.example.lesson_4

fun main() {
    val day = 5
    println(
        "Упражнения для рук: ${day % 2 != 0}\n" +
                "Упражнения для ног: ${day % 2 == 0}\n" +
                "Упражнения для спины: ${day % 2 == 0}\n" +
                "Упражнения для спины: ${day % 2 != 0}"
    )
}