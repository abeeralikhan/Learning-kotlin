package day_two

fun main() {
    val name = "Abeer Ali Khan"
    var checkName1 = if(name=="Abeer Ali Khan") "Yes" else "No"
    var checkName2 = when(name) {
        "Abeer Ali Khan" -> "Yes"
        else -> "No"
    }

    println("Has the name matched? --> $checkName1")
    println("Has the name matched? --> $checkName2")
}