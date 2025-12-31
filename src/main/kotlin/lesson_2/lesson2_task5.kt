package org.example.lesson_2

fun main() {
    val initialAmount = 70000
    val interestRate = 16.7
    val depositPeriod = 20
    val totalAmount = initialAmount * Math.pow((1 + interestRate / 100), depositPeriod.toDouble())
    println( String.format("Total amount: %.3f", totalAmount))
}