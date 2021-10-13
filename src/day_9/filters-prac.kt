package day_9

fun startsWith(fruits: Array<String>, letter: Char) {
    println(fruits.filter { it[0] == letter })
}
fun main() {
    val fruits = arrayOf("Apple", "Apricot", "Strawberry", "Watermelon", "Walnut")
    println("Print all fruits that starts with 'A': ")
    startsWith(fruits, 'A')
    println("Print all fruits that starts with 'W': ")
    val startsWithW = fruits.filter { it[0] == 'W' }
    println(startsWithW)
    println("Print all fruits that starts with 'S': ")
    val startsWithS = fruits.asSequence().filter { it[0] == 'S' }
    println(startsWithS) // converting back sequence object into a list

    val realNums = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println(realNums.filter { it < 5 })
    println(realNums.filter { it%2==0 })
    println(realNums.filter { it%2!=0 })
}