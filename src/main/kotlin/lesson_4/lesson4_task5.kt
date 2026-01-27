package org.example.lesson_4

const val MIN_NUMBER_CREW = 55
const val MAX_NUMBER_CREW = 70
const val MIN_PROVISIONS = 50

fun main() {
    println("the presence of damage to the case:")
    val isDamaged = readln().toBoolean()
    println("current crew composition:")
    val numberCrew = readln().toInt()
    println("the number of crates of provisions:")
    val provisions = readln().toInt()
    println("favorable weather conditions:")
    val isWeatherFavorable = readln().toBoolean()

    val isOpportunitySetSail =
        (!isDamaged && numberCrew >= MIN_NUMBER_CREW && numberCrew <= MAX_NUMBER_CREW && provisions > MIN_PROVISIONS) ||
                (isDamaged && isWeatherFavorable && numberCrew == MAX_NUMBER_CREW && provisions >= MIN_PROVISIONS)
    println("Can the ship set sail? $isOpportunitySetSail")
}
