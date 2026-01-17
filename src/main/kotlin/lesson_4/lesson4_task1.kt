package org.example.lesson_4

const val TOTAL_TABLES = 13

fun main() {
    val tablesBookedToday = 13
    val tablesBookedTomorrow = 9
    val availableToday = TOTAL_TABLES > tablesBookedToday
    val availableTomorrow = TOTAL_TABLES > tablesBookedTomorrow

    println(
        "[Availability of tables for today: $availableToday],\n" +
                "[Availability of tables for tomorrow: $availableTomorrow]."
    )

}