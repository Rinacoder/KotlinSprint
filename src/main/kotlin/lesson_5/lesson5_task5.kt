package org.example.lesson_5

import kotlin.random.Random

const val MIN_NUM = 0
const val MAX_NUM = 42

fun main() {
    val numberList = List(3) { Random.nextInt(MAX_NUM + 1) }
    val userList: ArrayList<Int> = arrayListOf()
    for (i in 0..2) {
        println("Enter a number between $MIN_NUM and $MAX_NUM")
        userList.add(readln().toInt())
    }

    val coincidences = numberList.intersect(userList).count()

    if (coincidences == 3) {
        println("Congratulations! You have won the jackpot!")
    } else if (coincidences == 2) {
        println("Congratulations! You guessed two numbers and won a big prize!")
    } else if (coincidences == 1) {
        println("Congratulations! You guessed one number and get a consolation prize!")
    } else {
        println("You didn't guess a single number!")
    }

    println(numberList)
}


