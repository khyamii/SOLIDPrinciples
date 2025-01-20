package interfaceSegregation.Example2

class QRCodePayment : PaymentMethod {
    override fun validatePaymentDetails() {
        throw UnsupportedOperationException("Validation of payment details is not applicable for QR code payments.")
    }

    override fun processPayment(amount: Double) {
        println("Processing QR code payment of $$amount.")
    }

    override fun generateQRCodeForPayment() {
        println("Generating QR code for payment...")
    }
}