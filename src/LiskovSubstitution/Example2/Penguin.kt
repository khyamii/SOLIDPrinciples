package LiskovSubstitution.Example2

class Penguin : Bird() {
    override fun move(): String {
        return " I can swimming !"
    }

}