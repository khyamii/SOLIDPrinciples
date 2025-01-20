package openClosed.Example2

open class LoggerError {
    open fun logError(message: String) {
        println("Save Error message at file 1: $message") // Default logging
    }
}
