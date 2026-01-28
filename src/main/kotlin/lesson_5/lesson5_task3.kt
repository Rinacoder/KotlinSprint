package org.example.lesson_5

fun main() {
    val number1 = 13
    val number2 = 37
    println("Enter the first number from 0 to 42")
    val userNumber1 = readln().toInt()
    println("Enter the second  number from 0 to 42")
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