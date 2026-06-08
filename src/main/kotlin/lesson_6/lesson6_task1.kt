package org.example.lesson_6

fun main() {
    println("Создайте логин:")
    var login = readln()
    println("Создайте пароль")
    var password = readln()

    var isAuthorized = false  // флаг: авторизация прошла

    while (!isAuthorized) {
        println("Введите логин:")
        var userLogin = readln()
        println("Введите пароль")
        var userPassword = readln()
        if (userLogin != login || userPassword != password) {
            println("Неверный логин или пароль")
        } else {
            isAuthorized = true
        }
    }
    println("Авторизация прошла успешно")
}