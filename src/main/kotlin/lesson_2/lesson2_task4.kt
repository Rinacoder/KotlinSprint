package org.example.lesson_4

const val ONE_HUNDRED_PERCENT = 100

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffPercent = 20
    val crystalOresBuff = crystalOre * buffPercent / ONE_HUNDRED_PERCENT
    val ironOresBuff = ironOre * buffPercent / ONE_HUNDRED_PERCENT
    println( "buff crystal = $crystalOresBuff")
    println( "buff iron = $ironOresBuff")
}