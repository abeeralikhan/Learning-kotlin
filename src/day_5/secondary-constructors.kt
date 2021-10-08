package day_5

fun main() {
    val p1 = Programmer("Abeer", 21)
    val p2 = Programmer("Jahangir", 25, arrayOf("Kotlin", "C++"))

    println(p1.displayStack())
    println(p2.displayStack())
}

class Programmer(var name: String, var age: Int) {
    var techStack: Array<String> = arrayOf()
    init {
        println("Programmer instance has been initiated")
    }
    constructor(name: String, age: Int, techStack: Array<String>): this(name, age) {
        this.techStack = techStack
    }

    fun displayStack() {
        if (techStack.isNotEmpty()) {
            for (tech in techStack) println(tech)
        } else {
            println("Undefined.")
        }
    }
}