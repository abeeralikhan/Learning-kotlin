package day_one

// top level variables
val PI: Float = 3.14523F

fun main() {
    // declaring variables local ly
    // There are two types of variables in kotlin
    // 1. Mutable Variables (defined using var)
    var name: String = "Abeer Ali Khan"

    // 2. Immutable Variables (defined using val)
    val age: Int = 21
    // age = 19 --> We can't update val variables

    println("$name is $age years old.")
    println("The value of PI is $PI")
}