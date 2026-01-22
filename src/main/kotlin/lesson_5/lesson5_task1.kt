package org.example.lesson_5

fun main() {
    val a = 5
    val b = 3
    println("add two numbers: $a + $b =")
    val sum = readln().toInt()
    if (sum == a + b) {
        println("Welcome!")
    } else {
        println("Access is denied.")
    }
}