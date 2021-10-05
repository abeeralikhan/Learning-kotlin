package day_two

fun main() {
    // return type of forEach loop is Unit. That means, it doesn't return anything
    val progLanguages = arrayOf("C++", "Python", "Kotlin", "JavaScript", "Java")

    // following is the elaboration of forEach loop
    progLanguages.forEach {
        println(it)
    }

    // How to change "it" to something else?
    progLanguages.forEach { progLang ->
        println(progLang)
    }

    // But, now we have access to the element, what about the index value?
    // How to also keep a track of index values?

    progLanguages.forEachIndexed { i, it ->
        println("progLanguages[$i] --> $it")
    }

}