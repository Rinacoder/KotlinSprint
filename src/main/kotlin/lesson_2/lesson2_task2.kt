package org.example.lesson_2

fun main() {
    val numberPermanentEmployees = 50
    val salaryPermanentEmployee = 30000
    val salaryExpensesPermanentEmployees = numberPermanentEmployees * salaryPermanentEmployee
    val numberInterns = 30
    val salaryInterns = 20000
    val salaryExpensesInterns = numberInterns * salaryInterns
    val totalSalaryCosts = salaryExpensesPermanentEmployees + salaryExpensesInterns
    val averageSalary = totalSalaryCosts / (numberPermanentEmployees + numberInterns)
    println("Salary expenses for permanent employees $salaryExpensesPermanentEmployees")
    println("Total salary costs after the arrival of interns $totalSalaryCosts")
    println("The average salary of one employee after the placement of interns $averageSalary")
}