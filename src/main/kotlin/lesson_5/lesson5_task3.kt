package org.example.lesson_5

const val MIN_NUMBER = 0
const val MAX_NUMBER = 42

fun main() {
    val number1 = 13
    val number2 = 37
    println("Enter the first number from $MIN_NUMBER to $MAX_NUMBER")
    val userNumber1 = readln().toInt()
    println("Enter the second  number from $MIN_NUMBER to $MAX_NUMBER")
    val userNumber2 = readln().toInt()

    if ((number1 == userNumber1 && number2 == userNumber2) || (number1 == userNumber2 && number2 == userNumber1)) {
        println("Congratulations! You've won the grand prize!")
    } else if (number1 == userNumber1 || number1 == userNumber2 || number2 == userNumber1 || number2 == userNumber2) {
        println("You've won a consolation prize!")
    } else {
        println("Bad luck!")
    }
    println("The numbers needed to win: $number1, $number2")
}