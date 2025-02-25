package dependencyInversion.Example2

class PaypalPayment : PayService{
    override fun pay(amount: Double) {
        println("pay $amount with paypal")
    }
}