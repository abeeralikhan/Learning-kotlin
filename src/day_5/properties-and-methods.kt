package day_5

class Fan {
    private var state: Boolean = false

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
    val f1 = Fan()
    f1.turnOFF()
    f1.turnON()
    f1.turnON()
    println("State of the fan currently ${f1.getFanState()}")
}