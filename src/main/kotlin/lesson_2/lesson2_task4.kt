package org.example.lesson_4

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffPercent = 20
    val crystalOresBuff = crystalOre * buffPercent / 100
    val ironOresBuff = ironOre * buffPercent / 100
    println( "buff crystal = $crystalOresBuff")
    println( "buff iron = $ironOresBuff")
}