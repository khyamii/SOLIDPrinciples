package dependencyInversion.Example1

class EmailLogin : LoginService{
    override fun login(email: String, password: String): Boolean {
        println("Logging in with Email: $email")
        return true
    }
}