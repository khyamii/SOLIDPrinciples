package LiskovSubstitution.Example2

abstract class Bird {
    open fun eat(): String {
        return "I am eating!"
    }

    abstract fun move(): String
}

