package org.example.lesson_4

const val FAVORABLE_WEATHER_SUNNY = true
const val FAVORABLE_TENT_OPEN= true
const val FAVORABLE_AIR_HUMIDITY = 20
const val NOT_FAVORABLE_TIME_YEAR = "winter"


fun main() {
    val weatherToday: Boolean = true
    val awningOpen: Boolean = true
    val airHumidity: Int = 20
    val timeYear: String = "winter"
    println("Are the conditions favorable for legume growth now? " +
            "${FAVORABLE_WEATHER_SUNNY == weatherToday && 
                    FAVORABLE_TENT_OPEN == awningOpen &&
                    FAVORABLE_AIR_HUMIDITY == airHumidity && 
                    NOT_FAVORABLE_TIME_YEAR != timeYear}")
}