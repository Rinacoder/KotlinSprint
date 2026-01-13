package org.example.lesson_4

const val Min_Weight = 35
const val Max_Weight = 100
const val Max_Volume = 100

fun main() {
    var weight = 20
    var volume = 80
    println("The cargo with a weight of $weight kg and a volume of $volume liters corresponds to the category 'Average': " +
            "${(weight > Min_Weight) and (weight <= Max_Weight) and  (volume < Max_Volume)}"
    )
    weight = 50
    volume = 100
    println("The cargo with a weight of $weight kg and a volume of $volume liters corresponds to the category 'Average': " +
            "${(weight > Min_Weight) and (weight <= Max_Weight) and  (volume < Max_Volume)}"
    )
}