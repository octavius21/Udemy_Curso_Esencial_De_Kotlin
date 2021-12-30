package StringTemplate

fun main(){
    val price=15.25
    val tax=0.16
    val out="La cantidad de $price despues de impuestos es: $${price * (1+tax)}  "
    println(out)

    val discreimer="La cantidad esta en \$MXN"
    println(discreimer)
    val total=price.times(tax.plus(1))
    println(total.toFloat())
}