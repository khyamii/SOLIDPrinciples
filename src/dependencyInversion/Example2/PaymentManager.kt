package dependencyInversion.Example2

class PaymentManager(private val payService: PayService) {

    fun processPayment(amount: Double) {
        payService.pay(amount)
    }
}