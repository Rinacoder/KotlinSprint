package org.example.lesson_3

fun main() {
    var startPosition = "E2"
    var finalPosition = "E4"
    var strokeNumber = 1

    var move = "[$startPosition-$finalPosition;$strokeNumber]"
    println(move)

    startPosition = "D2"
    finalPosition = "D3"
    strokeNumber++

    move = "[$startPosition-$finalPosition;$strokeNumber]"
    println(move)
}