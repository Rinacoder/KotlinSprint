package org.example.lesson_1

fun main() {

    var seconds: Int = 6480
    val hour: Int = seconds / 3600
    seconds %=  3600
    val minute: Int = seconds / 60
    seconds %=  60

    if(hour > 9)
        print(hour)
    else
        print("0$hour")
    print(":")
    if(minute > 9)
        print(minute)
    else
        print("0$minute")
    print(":")
    if(seconds > 9)
        print(seconds)
    else
        print("0$seconds")
}