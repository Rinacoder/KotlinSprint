package org.example.lesson_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {
    var weight = 20
    var volume = 80
    println("The cargo with a weight of $weight kg and a volume of $volume liters corresponds to the category 'Average': " +
            "${(weight > MIN_WEIGHT) and (weight <= MAX_WEIGHT) and  (volume < MAX_VOLUME)}"
    )
    weight = 50
    volume = 100
    println("The cargo with a weight of $weight kg and a volume of $volume liters corresponds to the category 'Average': " +
            "${(weight > MIN_WEIGHT) and (weight <= MAX_WEIGHT) and  (volume < MAX_VOLUME)}"
    )
}