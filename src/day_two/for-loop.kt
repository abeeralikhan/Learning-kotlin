package day_two

fun printNumbers(start: Int, stop: Int){
    if (start < stop) for(i in (start until stop+1)) println(i)
    else println("Invalid Range!")
}
fun main() {
    println("First Range: ")
    printNumbers(22, 35)
    println("Second Range: ")
    printNumbers(35, 22)
}