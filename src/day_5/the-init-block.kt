package day_5

class CelingFan {
    private var state: Boolean

    init {
        println("Object of the \"Ceiling Fan\" class has been initiated.")
        state = false
    }

    fun turnON() {
        if (state) {
            println("Fan has already been turned ON!")
        }
        else {
            state = true
            println("Turning ON the fan!")
        }
    }

    fun turnOFF() {
        if(!state) {
            println("Fan has already been turned OFF!")
        } else {
            state = false
            println("Turning OFF the fan!")
        }
    }

    fun getFanState(): Boolean {
        return state
    }
}
fun main() {
    val f1 = CelingFan()
    f1.turnOFF()
    f1.turnON()
    f1.turnON()
    println("State of the fan currently ${f1.getFanState()}")
}