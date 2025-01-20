package interfaceSegregation.Example1

class AdvancedPrinter : Printer {
    override fun printDocument() {
        println("Printing document...")
    }

    override fun scanDocument() {
        println("Scanning document...")
    }

}