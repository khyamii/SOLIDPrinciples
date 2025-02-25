package dependencyInversion.Example1

// high level modules
class AuthManager(private val loginService: LoginService) {

    fun login(email: String, password: String) {
        val success = loginService.login(email,password)
        if (success){
            println("login sucess")
        }else {
            println(" an error occur !")
        }
    }
}
