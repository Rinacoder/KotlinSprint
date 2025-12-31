package org.example.lesson_2

fun main() {
    val scoreStudent = listOf(3, 4, 3, 5)
    val averageScore = scoreStudent.sum().toDouble()/scoreStudent.count()
    println( String.format("Average students score: %.2f", averageScore))
}