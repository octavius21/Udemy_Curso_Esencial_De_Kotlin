package Funciones

import java.lang.StringBuilder

fun main(){
    val appName="My fabulous App"
    val welcome="Welcome to the best experience"
    val name= getWelcomeText()
    //Stringbuilder
    val appNameFormated= addStartsformat(appName,5)
    println(appName)
    println(appNameFormated)

    println(addStartsformat(welcome,7))
    println(multiply(2))
    println(double(3))
    println(double2(4))
    println(cleanText(name))
    println(addStartsformat(name))
    println(addStartsformat('L'))


}

fun addStartsformat(text:String,numberstarts:Int):String{
    val textbuilder= StringBuilder(text)

    textbuilder.insert(0 ," ")
    textbuilder.insert(textbuilder.length, " ")
    for(i in 0 until numberstarts){
        textbuilder.insert(0,"*")
        textbuilder.insert(textbuilder.length,"*")
    }
    return textbuilder.toString()
}
fun addStartsformat(text:String):String{
    val textbuilder= StringBuilder(text)

    textbuilder.insert(0 ," ")
    textbuilder.insert(textbuilder.length, " ")
    for(i in 0 until 5){
        textbuilder.insert(0,"*")
        textbuilder.insert(textbuilder.length,"*")
    }
    return textbuilder.toString()
}

fun multiply(x:Int):Int{
    return 2*x
}

fun double(x:Int):Int=x*2
fun double2(x:Int)=x*2

private fun getWelcomeText() = "*** Luocz ***"
fun cleanText(text: String):String=text
    .removePrefix("***")
    .removeSuffix("***")
    .trim()

fun addStartsformat(text:Char):String= addStartsformat(text+""+text,2)