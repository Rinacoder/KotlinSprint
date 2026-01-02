package org.example.lesson_3

fun main() {
    val dayGreeting = "Good afternoon,"
    val eveningGreeting = "Good evening,"
    val name = "Irina"

    var fullGreeting = "$dayGreeting $name!"
    println(fullGreeting)
    fullGreeting = "$eveningGreeting $name!"
    println(fullGreeting)
}