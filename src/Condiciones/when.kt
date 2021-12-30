package Condiciones

fun main(){
    var i:Any=2
    var x:Int=2

    when(i){
        is Boolean-> println("boolean")
        is Int-> println("Double")
        is String-> println("String")
        !is String-> println("No es cadena")
        else-> println("Se pa dios que sea")
    }
    when {
        x<0 -> println("error o cero")
        x==0 -> println("Es cero")
        else-> println("mayor que cero")
    }
    var userStatus=0
    val userStatusString=when(userStatus){
        0->"logout"
        1->"login"
        -1->"not foud"
        in 10..20->"inactive"
        else->"down"
    }
    println(userStatusString)
    val hasAddress=true
    val islogin=true
    val user="luocz"
    val response=when{
        hasAddress and islogin->"lista de direcciones de $user"
        hasAddress and !islogin->" no lista de direcciones de $user"
        else->"nada"
    }
    println(response)

}