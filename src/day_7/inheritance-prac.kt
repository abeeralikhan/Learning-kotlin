package day_7

fun main() {
    val dr = Derived(1, 2, 3)
    dr.printData()
    println(dr.classMember)
    println(dr.noOverride)
}

open class BaseClass (x: Int, y: Int) {
    var x: Int
    var y: Int
    open var classMember: String = "Hello there"
    open var noOverride: String = "Hello world!"

    init {
        this.x = x
        this.y = y
    }
    open fun printData() {
        println("$x $y")
    }
}

// Derived Class with a primary constructor
class Derived(x: Int, y: Int, var z: Int): BaseClass(x, y) {
    override var classMember: String
        get() = super.classMember
        set(value) {}

    override fun printData() {
        super.printData()
        println("$x $y $z")
    }
}

// Derived Class without a primary constructor
class DerivedSecond: BaseClass {
    constructor(x: Int, y: Int): super(x, y) {
        println("Derived class has been initialized with the base class' parmteters")
    }

}