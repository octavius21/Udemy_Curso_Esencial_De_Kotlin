package Math

import java.math.BigDecimal

fun main(){
    val products = listOf(
        BigDecimal(33.5),
        BigDecimal(73.5),
        BigDecimal(43.5),
        BigDecimal(53.5)

    )
    val economyPrices = products.count {
        it< BigDecimal(50.0)
    }
    println(economyPrices)

    val total = products.sumOf {
        it.toBigInteger()//La redondea
    }
    println(total)

    val random = products.random()
    println(random)

    val average = listOf(0,3,5,6,7,9)
    val averageScore =average.average().toFloat()

    println(averageScore)


    //PILARES de PROGRAMACION FUNCIONAL

    //INMUTABILIDAD(VAL y NO VAR)
    //SISTEMA DE TIPOS
    //FUNCIONES DE ORDEN SUPERIOR
    //FUNCIONES PURAS
    //RECURSIVIDAD
    //




    //ELVIS
    //val number :Int?=null
    //return number ?: 0
}