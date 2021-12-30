package Funciones

fun main(){
    val printHola={
        println("Hola Lambda")
    }
    printHola()

    val printText={ text:String ->
        println(text)
    }
    printText("hola lambda")

    val addOneTo={x:Int->
        x+1
    }
    val result=addOneTo(2)
    println(result)

    val addfiveto:(Int)->Int={
        it+5
    }
    println(addfiveto(5))

    val sum:(Int,Int,String)->Int={ x:Int, y:Int, _:String->
        x+y
    }
    println(sum(5,3,""))

     val sum2:(Int,Int,String)->Int={ x:Int, y:Int, message:String->
        val total = x + y
         println("$message $total")
         total
    }
    println(sum2(5,3,"El Resultado es: "))
    sum2(5,3,"El Resultado es: ")

}