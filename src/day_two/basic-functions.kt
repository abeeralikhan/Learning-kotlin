package day_two

// Function with no parameters and non-void
fun getDate(): String {
    return "05/10/2021"
}

// Function with parameters and non-void
fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun sub(num1: Int, num2: Int): Int {
    return num1 - num2
}

// Void Functions
fun printDate(): Unit {
    println("05/10/2021")
}

// Or we can also eliminate "Unit" type as it's redundant
fun printDate(day: Int, month: String, year: Int) { // Function overloading
    println("$day $month $year")
}

fun main() {
    println("Today date is ${getDate()}")
    println("Addition of 19 and 11 is ${add(19, 11)}")
    println("Subtraction of 11 from 20 is ${sub(20, 11)}")
    printDate()
    printDate(5, "Oct", 2021)
}