package LiskovSubstitution.Example2

class FlyingBird : Bird() {
    override fun move(): String {
       return " I can Flying !"
    }
}