package interfaceSegregation.Example2

class QRCodePayment : GenrateQrCode {

    override fun processPayment(amount: Double) {
        println("Processing QR code payment of $$amount.")
    }

    override fun generateQRCodeForPayment() {
        println("Generating QR code for payment...")
    }
}