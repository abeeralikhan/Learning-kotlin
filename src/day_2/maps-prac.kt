package day_two

import kotlin.reflect.typeOf

fun main() {
    // maps in kotlin can be defined in the following way

    val days = mapOf("Mon" to "Monday", "Tue" to "Tuesday", "Wed" to "Wednesday")

    days.forEach { key, value ->
        println("$key: $value")
    }
}