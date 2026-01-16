package org.example.lesson_4

val TOTAL_TABLES = 13

fun main() {
    val TablesBookedToday = 13
    val TablesBookedTomorrow = 9
    val availableToday = TOTAL_TABLES > TablesBookedToday
    val availableTomorrow = TOTAL_TABLES > TablesBookedTomorrow

    println(
        "[Availability of tables for today: $availableToday],\n" +
                "[Availability of tables for tomorrow: $availableTomorrow]."
    )

}