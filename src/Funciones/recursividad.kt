package Funciones

fun main(){
    val productprices= doubleArrayOf(5.0,3.0,2.0)
    println(getProductPrices(productprices,productprices.size-1))
}
fun getProductPrices(productPrices:DoubleArray,maxIndex:Int):Double {
    if (maxIndex == 0) return productPrices[0]

    return productPrices[maxIndex] + getProductPrices(productPrices, maxIndex - 1)
}