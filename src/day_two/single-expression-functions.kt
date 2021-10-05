package day_two

// Kotlin provides us single expression function to reduce boiler code
// Therefore, code will look precise and clean

fun calPercentage(secured: Float, total:Float) = (secured / total) * 100

fun fullDay(shortDay: String) = when(shortDay) {
    "Mon" -> "Monday"
    "Tue" -> "Tuesday"
    "Wed" -> "Wednesday"
    "Thur" -> "Thursday"
    "Fri" -> "Friday"
    "Sat" -> "Saturday"
    "Sun" -> "Sunday"
    else -> "No-day"
}

fun main() {
    val securedGPA = 3.77f
    val totalGPA = 4f
    val percentage = calPercentage(securedGPA, totalGPA)

    // percentage
    println("$securedGPA/$totalGPA GPA. \nTotal Percentage is $percentage%")

    //full day
    println("\nMon --> ${fullDay("Mon")}")
    println("Sat --> ${fullDay("Sat")}")
    println("Bri --> ${fullDay("Bri")}")

    // Note: Following singular expression function can be converted into a variable which is more efficient
    fun name() = "Abeer Ali Khan" // it has no parameter, therefore, it's redundant
    val name = "Abeer Ali Khan" // Declaring it in this way is more efficient
}