package day_9

fun main() {
    val realNums = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println("First 7 real numbers --> ${realNums.map { it }}.")
    println("Squared --> ${realNums.map { it * it }}")
    println("Inremented --> ${realNums.map { it + 1 }}")
    println("Divided by 2 --> ${realNums.map { it / 2 }}")
    println("Multiplied by 2 --> ${realNums.map { it * 2 }}")

}