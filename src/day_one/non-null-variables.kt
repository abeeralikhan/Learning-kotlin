package day_one

fun main() {
    // types in kotlin are non-null by default
    // that means you can not directly declare a null variable
    // var name: String = null --> This won't work

    // Instead, we need to put a "?" after type to make it a nullable variable

    var myAge: Int? = null
    var myName: String? = "Abeer Ali Khan"
    myAge = 21
    myName = null

    // Hence, "?" tell that variable it can also hold a null value :)
    println("My name is $myName, and I'm $myAge years old")
}