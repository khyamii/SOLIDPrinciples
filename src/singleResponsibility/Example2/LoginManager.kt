package singleResponsibility.Example2

class LoginManager(val errorLogger: ErrorLogger) {
    fun login(username: String, password: String) {
        if (username == "admin" && password == "1234") {
            println("Login successful")
        } else {
            println("Invalid username or password")
            errorLogger.saveErrorLog("Login failed for user: $username")
        }
    }


}