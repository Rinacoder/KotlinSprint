package org.example.lesson_4

val Total_Tables = 13

fun main() {
    val TablesBookedToday = 13
    val TablesBookedTomorrow = 9
    val availableToday = Total_Tables > TablesBookedToday
    val availableTomorrow = Total_Tables > TablesBookedTomorrow

    println(
        "[Availability of tables for today: $availableToday],\n" +
                "[Availability of tables for tomorrow: $availableTomorrow]."
    )

}