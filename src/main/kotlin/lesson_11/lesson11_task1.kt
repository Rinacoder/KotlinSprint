package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val user1 = User(
        id = 1,
        login = "user1",
        password = "passwordUser1",
        email = "user1@mail.com"
    )
    val user2 = User(
        id = 2,
        login = "user2",
        password = "passwordUser2",
        email = "user2@mail.com"
    )
    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)
    println()

    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)
}
