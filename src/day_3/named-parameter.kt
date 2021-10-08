package day_three

fun displayInfo(name: String, age: Int) {
    println("$name is $age years old.")
}
fun main() {
    val myName = "Abeer"
    val myAge = 21
    displayInfo(age = myAge, name = myName)
}