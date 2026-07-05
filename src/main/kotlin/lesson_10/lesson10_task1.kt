package org.example.lesson_10

fun main() {
    val rollUser = rollDice()
    println("Ход Игрока: $rollUser")
    val rollComp = rollDice()
    println("Ход Компьютера: $rollComp")
    when {
        rollUser > rollComp -> println("Выиграл игрок")
        rollUser < rollComp -> println("Выиграл компьютер")
        else -> println("Ничья")
    }
}

fun rollDice(): Int = (1..6).random()
