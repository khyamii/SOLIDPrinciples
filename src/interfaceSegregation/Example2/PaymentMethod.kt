package interfaceSegregation.Example2

interface PaymentMethod {
    fun validatePaymentDetails()
    fun processPayment(amount: Double)
    fun generateQRCodeForPayment()
}