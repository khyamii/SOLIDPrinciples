package interfaceSegregation.Example2

class CreditCardPayment : ValidateCreditCard {
    override fun validatePaymentDetails() {
        println("Validating credit card details...")
    }

    override fun processPayment(amount: Double) {
        println("Processing credit card payment of $$amount.")
    }

}