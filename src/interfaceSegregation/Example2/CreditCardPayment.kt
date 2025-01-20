package interfaceSegregation.Example2

class CreditCardPayment : PaymentMethod {
    override fun validatePaymentDetails() {
        println("Validating credit card details...")
    }

    override fun processPayment(amount: Double) {
        println("Processing credit card payment of $$amount.")
    }

    override fun generateQRCodeForPayment() {
        throw UnsupportedOperationException("QR code generation is not applicable for credit card payments.")
    }
}