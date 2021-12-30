package Condiciones
import kotlin.system.measureNanoTime

fun main(){
    val greetings= arrayOf("Hola","Hi","Bienvenido")

    for (i in greetings.indices){
        println(greetings[i])
    }
    greetings.forEach{
        println(it)
    }
    val forInRange= measureNanoTime {
        for(i in 0..1000)
            i
    }
    val forEachRange= measureNanoTime {
        (0..1000).forEach{
            it
        }
    }
    println("ForEachRange: "+forEachRange)
    println("ForInRange: "+forInRange)

    val objectlist=(0..1000).toList()

    val forInList =measureNanoTime {
        for (i in objectlist){
            i
        }
    }
    val forEachList =measureNanoTime {
        objectlist.forEach { it }
    }
    println("ForEachList: $forEachList")
    println("ForInLList: $forInList")

    println("Trabajar foreach cuando sean colecciones/listas")
    println("Trabajar forin cuando sean rangos")
}