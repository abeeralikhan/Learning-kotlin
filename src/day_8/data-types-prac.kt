package day_8

import kotlin.math.roundToLong

fun main() {
    // Type conversion
    var byteType: Byte = 10
    var intType: Int = byteType.toInt()

    var floatType: Float = 3.997f
    var longType: Long = floatType.toLong() // It will remove trailing decimal values
    var roundLong: Long = floatType.roundToLong() // It will round to decimal values

    println(intType)
    println(longType)
    println(roundLong)

    // Making numbers more readable
    val oneMillion = 1_000_000L

    println(byteType.inc())

}