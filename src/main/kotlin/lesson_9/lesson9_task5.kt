package org.example.lesson_9

fun main() {
    val ingredients = mutableListOf<String>()

    for (i in 1..5) {
        println("Введите название ингредиента")
        val ingredient = readln().lowercase()
        if (ingredient !in ingredients && ingredient.isNotBlank()) {
            ingredients.add(ingredient)
        }
    }

    if (ingredients.isNotEmpty()) {
        val sortedIngredients = ingredients.sorted().mapIndexed { index, item ->
            if (index == 0) item.replaceFirstChar { it.uppercase() } else item
        }
        println(sortedIngredients.joinToString(", "))
    } else {
        println("Нет введенных ингредиентов")
    }
}
