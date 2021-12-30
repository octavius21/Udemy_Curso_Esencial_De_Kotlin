package ConversionDatos

fun main(){
    val productlowstock:Byte=20

    val productStock: Int = productlowstock.toInt()
    println(productStock)
    //❤ 0X2764
    //♡ 0X2661
    val unicodeInt=0X2661
    val unicodeChar=unicodeInt.toChar()
    val unicode=unicodeChar.toString()
    println(unicode)

}