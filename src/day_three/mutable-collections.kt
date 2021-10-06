package day_three

fun displayList(list: MutableList<Int>) {
    for (i in list) println(i)
}

fun displayMap(map: MutableMap<Int, String>) {
    map.forEach { key, value ->
        println("$key: $value")
    }
}

fun main() {
    // In kotlin, collections are immutable by default.
    // But, we can make mutable collections like following:

    // Mutable list
    val oddNumbers = mutableListOf(1, 3, 5, 7, 9)
    oddNumbers.add(11)
    displayList(oddNumbers)

    // Mutable map
    val mappings = mutableMapOf(1 to "A", 2 to "B", 3 to "C")
    mappings.put(4, "D")
    displayMap(mappings)
}