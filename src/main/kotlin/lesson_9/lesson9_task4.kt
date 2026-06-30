package org.example.lesson_9

fun main() {
    println("Введите список из 5 ингредиентов, перечисленных через запятую с пробелом")
    val ingredients = readLine()?.split(", ")
    if (ingredients?.size == 5) {
        val sortedIngredients = ingredients.sorted()
        println(sortedIngredients.joinToString())
    } else {
        println("Введено неверное количество ингредиентов")
    }
}

