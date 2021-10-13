package day_9

fun countDown(start: Int) {
    for (i in start downTo 1) print("$i ")
}

fun takeSteps(start: Int, stop: Int, stepSize: Int) {
    for (i in start..stop step stepSize) print("$i ")
}

fun enumerate(fruits: Array<String>) {
    for ((index, fruit) in fruits.withIndex()) println("${index+1} $fruit")
}

fun main() {
    println("Count down: ")
    countDown(10)
    println("\nOdd Numbers: ")
    takeSteps(1, 11, 2)
    println("\nFruits with sr no. ")
    enumerate(arrayOf("Apple", "Banana", "Mango", "Cherry"))

}