package Funciones

fun main(){
    val user="Luocz"
    showWelcomeMessage("Hi")
    showWelcomeMessage("hola")
    showWelcomeMessage("buenos dias")
    showWelcomeMessage("Welcome",user)
    showWelcomeMessage("Hi",user, experience = true,edad=25)
}
/* infix*//*Para ya no poner la notacion . cuando el objeto hace uso del objeto */fun showWelcomeMessage(text:String,user:String="",experience:Boolean=false,edad:Int=18){
    val message="$text $user $experience $edad! ".trim()
    println(message)
}
