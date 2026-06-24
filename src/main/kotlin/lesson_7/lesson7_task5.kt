package org.example.lesson_7

fun main() {
    val result = mutableListOf<Char>()
    println("Введите длину пароля не меньше 6")
    val length = readln().toInt()
    val lowercase = 'a'..'z'
    val uppercase = 'A'..'Z'
    val digits = '0'..'9'
    var range: IntRange

    if (length >= 6) {
        range = 1..length
    } else {
        range = 1..6
    }
    for (i in range) {
        when (i) {
            in 1..range.last / 3 -> result.add(lowercase.random())
            in range.last / 3 + 1..range.last / 3 * 2 -> result.add(uppercase.random())
            else  -> result.add(digits.random())
        }
    }
    val password = result.shuffled().joinToString("")
    println(password)
}
