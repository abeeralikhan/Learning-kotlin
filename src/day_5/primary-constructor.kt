package day_5

// Method 1 to initialize class properties using the primary constructor
class Student(name: String, age: Int) {
    var std_name: String
    var std_age: Int

    init {
        std_name = name
        std_age = age
    }
}

// Optional: We can omit the constructor keyword
// Class Employee1 constructor(var emp_name: String, var emp_salary: Int)

// Method 2 to initialize class properties using the primary constructor
class Employee(var emp_name: String, var emp_salary: Int) { // Reduced all the boiler code
    fun getEmail(): String {
        return "${emp_name}123@gmail.com"
    }
}

fun main() {
    val s1 = Student("Abeer", 21)
    val e1 = Employee(s1.std_name, 200000)

    // Initialized properties using method 1
    println("${s1.std_name} is ${s1.std_age} years old")

    // Initialized properties using method 2
    println("${e1.emp_name} receives a salary of Rs. ${e1.emp_salary}")
    println(e1.getEmail())
    // Same output, but method has much more precise syntax
}