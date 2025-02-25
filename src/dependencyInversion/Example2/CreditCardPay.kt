package dependencyInversion.Example2

class CreditCardPayment :PayService {
    override fun pay(amount: Double) {
        println("Paid $$amount using Credit Card")
    }
}