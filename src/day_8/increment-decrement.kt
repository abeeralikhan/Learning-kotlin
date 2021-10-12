package day_8

fun incrementValue(data: Int, n: Int): Int{
    var data_mirror = data
    for (i in 1..n) {
        data_mirror = data_mirror.inc()
    }
    return data_mirror
}

fun decrementValue(data: Int, n: Int): Int {
    var data_mirror = data
    for (i in 1..n) {
        data_mirror = data_mirror.dec()
    }
    return data_mirror
}

fun main() {
    println(incrementValue(10, 10))
    println(decrementValue(10, 10))
}