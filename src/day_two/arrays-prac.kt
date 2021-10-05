package day_two

fun main() {
    // array of string
    val progLangs = arrayOf("Kotlin", "Python", "Java", "C++")

    // array of integers
    val marks = arrayOf(100, 75, 60, 70, 87)

    // array of floats
    val weights = arrayOf(34.5, 45.6, 95.5, 11.3)

    // Iterating over an array
    for (progLang in progLangs) {
        println(progLang)
    }

    for (mark in marks) {
        println(mark)
    }

    for (weight in weights) {
        println(weight)
    }
}