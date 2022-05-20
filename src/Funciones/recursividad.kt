package Funciones

fun main(){
    //0     1   2
    //5.0   3.0     2.0     //3-1

    //2     1       0
    //2.0   3.0     5.0
    val productprices= doubleArrayOf(5.0,3.0,2.0)
    println(getProductPrices(productprices,productprices.size-1))
}
fun getProductPrices(productPrices:DoubleArray,maxIndex:Int):Double {
    //caso base
    if (maxIndex == 0) return productPrices[0]
    //caso recursivo
    return productPrices[maxIndex] + getProductPrices(productPrices, maxIndex - 1)
}

//Los ARRAY(arrayof()) no cambian de tamaño y son mutables(se puede setear sus valores(se  busca que no por que puede producir bugs)
//Las colecciones admiten una cantidad 0
//No puedes cambiar sus valores solo lectura

//Existen List(listof()), Set(valores unicos(setOf)), Map(mapOf())(Clave y Valor)
//mutableListOf()   mutablesetOf()  mutablemapOf()