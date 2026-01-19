package org.example.lesson_4

const val FAVORABLE_AIR_HUMIDITY = 20
const val WINTER_SEASON = "winter"

fun main() {
    val isWeatherSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val airHumidity: Int = 20
    val timeYear: String = "winter"
    val areConditionsFavorable = isWeatherSunny && isAwningOpen &&
            FAVORABLE_AIR_HUMIDITY == airHumidity &&
            WINTER_SEASON != timeYear
    println("Are the conditions favorable for legume growth now? $areConditionsFavorable")
}
