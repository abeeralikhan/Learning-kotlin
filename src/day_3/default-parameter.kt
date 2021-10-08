package day_three

fun displayData(name: String = "Abeer", age: Int = 21) {
    println("$name is $age years old.")
}
fun main() {
    // Did not pass any argument, invoking default arguments.
    displayData()
}