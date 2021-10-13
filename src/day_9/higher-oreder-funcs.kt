package day_9

// Normal function becomes a higher order function by passing lambda function as an arguement
fun whatIsLength(str: String, knowLength: (String) -> Int): Int {
    return knowLength(str)
}
fun main() {
    // Following are definitions of lambda expressions
    // Old declaration
    val knowLength_old: (String) -> Int = {str -> str.length}

    // New declaration
    val knowLength_new = {str: String -> str.length}

    println(knowLength_old("Abeer"))
    println(knowLength_new("Abeer"))

    // higher-order functions
    println(whatIsLength("Abeer", knowLength_new))

}