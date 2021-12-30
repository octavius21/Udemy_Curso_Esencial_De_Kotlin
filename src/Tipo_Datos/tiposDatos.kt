package Tipo_Datos
fun main(){
    //Byte -127 -128
    val age=20
    val edad:Byte=127
    //Int 2mil millones
    val userId=2147483747
    val productId=2_147_483_747
    //val productId:Int=2_147_483_748
    // Long 9 trillones
    val userId2:Long=9223372036854775807
    val productoId2=9_223_372_036_854_775_807
    //Float
    val userId3=9.223372036854775807
    val productoId3=92.23372036854775807F
    println(userId3)
    println(productoId3)
    //Double
    val userId4:Long=9223372036854775807
    val productoId4=9_223_372_036_854_775_807
    //BigInteger
    //BigDecimal
    //Paramayor precision
    //Booleanos
    //true=1        false=0
    //Operaciones && || !   Ó and or not
    val isLoggedIn:Boolean=true
    val hasAdrress=false
    println(isLoggedIn &&hasAdrress)
    println(isLoggedIn.and(hasAdrress))
    println(isLoggedIn.not())
    println(!isLoggedIn)
    println(isLoggedIn and (hasAdrress))
    //Caracteres
    /* \t
    \b\n\r
     */
    val keyinserted='a'
    //String
    //Secuencia de caracteres
    val name:String="Luis"
    //val fullname="Name: $firstName $lastname"
    //val fullName= "Name: ${person.name}
    //val fulName="Name ${person.name}"
    //val monto ="Total:${sum1+sum2}"
}