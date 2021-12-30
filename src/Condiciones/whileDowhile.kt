package Condiciones

fun main(){
    val greetings= arrayOf("Hola","Hi","Bienvenido")
    var i=0;

    while(i<greetings.size-1){
        println("while1"+greetings[i])
        i++
    }
    i=0
    do{
        println("while2"+greetings[i])//se puede poner break y continue para romper o conseguir el while
        i++;
    }while(i<greetings.size)

}