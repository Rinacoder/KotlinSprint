package org.example.lesson_5
import java.time.Year

const val AGE_OF_MAJORITY = 18

fun main() {
    println("Enter the year of your birth")
    val yearBirth = readln().toInt()
    val currentYear = Year.now().getValue()
    val userAge = currentYear - yearBirth
    if (userAge >= AGE_OF_MAJORITY){
        println("Show special content")
    }
}
