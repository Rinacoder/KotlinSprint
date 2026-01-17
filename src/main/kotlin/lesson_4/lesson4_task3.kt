package org.example.lesson_4

const val FAVORABLE_AIR_HUMIDITY = 20
const val NOT_FAVORABLE_TIME_YEAR = "winter"


fun main() {
    val isWeatherSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val airHumidity: Int = 20
    val timeYear: String = "winter"
    println(
        "Are the conditions favorable for legume growth now? " +
                "${
                    isWeatherSunny && isAwningOpen &&
                            FAVORABLE_AIR_HUMIDITY == airHumidity &&
                            NOT_FAVORABLE_TIME_YEAR != timeYear
                }"
    )
}