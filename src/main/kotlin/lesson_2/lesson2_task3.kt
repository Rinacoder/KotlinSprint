package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val departureHour = 9
    val departureMinutes = 39
    val travelTime = 457
    val arrivalHour = departureHour + (travelTime + departureMinutes) / MINUTES_IN_HOUR
    val arrivalMinutes =(departureMinutes + travelTime) % MINUTES_IN_HOUR
    println(String.format("Train arrival time %02d:%02d", arrivalHour, arrivalMinutes))
}