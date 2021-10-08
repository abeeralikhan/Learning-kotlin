package day_four

// 1. Empty Class --> No parameter or braces required
class Empty

// 2. Parameterized Class
class Person(name: String, age: Int) {
    val p_name = name
    val p_age = age
}

// Define properties inside the primary constructor
class Dog(val name: String, val breed: String, val age: Int)
