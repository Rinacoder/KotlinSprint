package org.example.lesson_10

fun main() {
    var keepPlaying  = true
    var playerWins = 0
    while (keepPlaying ) {
        val rollUser = rollDice()
        println("Ход Игрока: $rollUser")
        val rollComp = rollDice()
        println("Ход Компьютера: $rollComp")
        when {
            rollUser > rollComp -> {
                println("Выиграл игрок")
                playerWins++
            }

            rollUser < rollComp -> println("Выиграл компьютер")
            else -> println("Ничья")
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        keepPlaying  = chekPlay(readln().lowercase())
    }
    println("Выиграно $playerWins партий")
}

fun rollDice(): Int = (1..6).random()

fun chekPlay(answer: String = "да"): Boolean = answer == "да"