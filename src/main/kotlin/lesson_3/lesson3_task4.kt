package org.example.lesson_3

fun main() {
    var initialPositionFigure = "E2"
    var finalFigurePosition = "E4"
    var strokeNumber = 1

    var move = "[$initialPositionFigure-$finalFigurePosition; $strokeNumber]"
    println(move)

    initialPositionFigure = "D2"
    finalFigurePosition = "D3"
    strokeNumber = 2

    move = "[$initialPositionFigure-$finalFigurePosition; $strokeNumber]"
    println(move)
}