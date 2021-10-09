package day_6

fun main() {
    val emp1 = Employee("Abeer Ali Khan", 20000)
    emp1.email = "abeeird" // using custom setter
    println(emp1.email)
    println(emp1.salaryInRps) // using custom getter
    println("Salary per anum: Rs. ${emp1.salaryPerAnum}") // using custom getter
}

class Employee(val name: String, var salary: Int) {
    var email: String? = null // We're using setter to set updated value for the property
        set(value) { // address for the employee
            field = "$value@abc.company.com"
            // setting field with intended value is important in update to the property
        }
    get() {
        return "$name's email address is $field" // field is referring to the value of the property
    }

    var salaryInRps: String? = null
        get() {
            return "Rs. $salary"
        }

    var salaryPerAnum: Int? = null
        get() {
            return salary*12
        }
}