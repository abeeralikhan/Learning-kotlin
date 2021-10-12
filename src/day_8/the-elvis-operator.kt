package day_8

fun arrayLength(arr: Array<String>?): Int {
    return arr?.size ?: -1
    // If array not null return its size, otherwise return -1
}
fun main() {
    var emptyArr: Array<String>? = null
    var fruits: Array<String>? = arrayOf("Apple", "Banana", "Orange")
    println(arrayLength(fruits))
    println(arrayLength(emptyArr))
}