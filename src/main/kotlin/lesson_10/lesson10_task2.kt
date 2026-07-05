package org.example.lesson_10

fun main() {
    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()
    if (isLoginPasswordValid(login = login, password = password)) {
        println("Привет!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun isLoginPasswordValid(login: String, password: String) = login.length >= 4 && password.length >= 4
