package org.example.lesson_1

const val secondsInHour = 3600
const val secondsInMinute = 60

fun main() {

    var seconds: Int = 6480
    val hour: Int = seconds / secondsInHour
    seconds %=  secondsInHour
    val minute: Int = seconds / secondsInMinute
    seconds %=  secondsInMinute

    println(String.format("%02d:%02d:%02d", hour, minute, seconds))

}