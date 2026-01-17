package org.example.lesson_1

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {

    var seconds: Int = 6480
    val hour: Int = seconds / SECONDS_IN_HOUR
    seconds %=  SECONDS_IN_HOUR
    val minute: Int = seconds / SECONDS_IN_MINUTE
    seconds %=  SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hour, minute, seconds))

}