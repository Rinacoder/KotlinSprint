package org.example.lesson_10

const val CORRECT_LOGIN = "login"
const val CORRECT_PASSWORD = "password"
val cartItems = listOf("молоко", "хлеб", "яблоки", "сыр")

fun main() {
    println("Введите логин")
    val userLogin = readln()
    println("Введите пароль")
    val userPassword = readln()
    val token = authorize(userLogin, userPassword)
    if (token != null) {
        println(getCart(token))
    } else {
        println("Не удалось авторизироваться")
    }

}

fun authorize(login: String, password: String): String? {
    val result = mutableListOf<Char>()
    if (login == CORRECT_LOGIN && password == CORRECT_PASSWORD) {
        for (i in 1..32) {
            when (i) {
                in 1..11 -> result.add(('a'..'z').random())
                in 12..22 -> result.add(('A'..'Z').random())
                else -> result.add(('0'..'9').random())
            }
        }
        return result.shuffled().joinToString("")
    }
    return null
}

fun getCart(token: String) = cartItems