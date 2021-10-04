package day_one

val temperatureC = 50f

fun main() {
    // IF-ELSE Control flow
    if (temperatureC < 30) {
        println("Weather is not that warm today!")

    } else if (temperatureC > 30 && temperatureC < 40) {
        println("Weather is warm today!")

    } else {
        println("Weather is extremely hot today!")
    }

    // WHEN Control flow
    when(temperatureC) {
        30f -> println("Weather is not that warm today!")
        40f -> println("Weather is warm today!")
        50f -> println("Weather is extremely hot today!")
        else -> println("Weather is pleasant today!")
    }
}