package dependencyInversion.Example1

class GmailLogin :LoginService {
    override fun login(email: String, password: String): Boolean {
        println(" login with gmail")
        return true
    }
}