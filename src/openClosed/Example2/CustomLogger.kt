package openClosed.Example2

class CustomLogger : LoggerError() {
    override fun logError(message: String) {

        println("Save Error on file 2")
    }
}