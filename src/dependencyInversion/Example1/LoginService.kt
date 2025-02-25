package dependencyInversion.Example1

interface LoginService {
    fun login(email:String,password:String):Boolean
}