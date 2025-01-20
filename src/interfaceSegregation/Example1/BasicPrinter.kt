package interfaceSegregation.Example1

class BasicPrinter : Printer {
    override fun printDocument() {
        println("Printing document...")
    }

    override fun scanDocument() {
        // Not supported, but forced to implement
        throw UnsupportedOperationException("Scanning is not supported")
    }

}