package day_9

import kotlin.random.Random

fun randomFruit(): String {
    val fruits = arrayOf("Apple", "Mango", "Banana", "Coconut", "Pomogrenate")
    return fruits[Random.nextInt(fruits.size)]
}
fun main() {
    println("My favorite fruits is ${randomFruit()}")
    println("My favorite fruits is ${randomFruit()}")
    println("My favorite fruits is ${randomFruit()}")
}