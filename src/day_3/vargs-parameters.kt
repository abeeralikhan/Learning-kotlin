package day_three

// Sometimes, we need to make functions flexible of parameters
// That means, we can pass from 0, 1 to up till n numbers of arguments
// The "vararg" parameter makes this possible for us

// We can pass n number of arguments, where n = 0, 1, 2, 3, ...
// All the arguments will be converted into a collection of list. On which we can iterate over
fun displayFruits(vararg fruit: String) {
    fruit.forEach {
        println(it)
    }

}
fun main() {
    println("#1")
    displayFruits()
    println("#2")
    displayFruits("Apple", "Banana")
    println("#3")
    displayFruits("Mango", "Apricot", "Watermelon", "Coconut")

    // Note: We can not pass an array in this function directly as it only accepts variables
    val fruits = arrayOf("Pineapple", "Strawberry", "Grapes", "Raspberry")
    // displayFruits(fruits) --> This will not work

    // To pass an array in this type of function, we need to use "*" (spread) operator
    println("#4")
    displayFruits(*fruits)
}