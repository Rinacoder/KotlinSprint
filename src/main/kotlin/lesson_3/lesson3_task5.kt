package org.example.lesson_3

fun main() {
    println("move:")
    val move = readLine()?.split("-",";")

    val initialPositionFigure = move?.get(0)
    val finalFigurePosition = move?.get(1)
    val strokeNumber = move?.get(2)

    println(initialPositionFigure)
    println(finalFigurePosition)
    println(strokeNumber)
}