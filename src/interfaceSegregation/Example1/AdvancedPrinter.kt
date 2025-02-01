package interfaceSegregation.Example1

class AdvancedPrinter : Printer,Scan {
    override fun printDocument() {
        println("Printing document...")
    }

    override fun scanDocument() {
        println("Scanning document...")
    }

}