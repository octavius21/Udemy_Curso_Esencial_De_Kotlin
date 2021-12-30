package Condiciones

import kotlin.system.exitProcess

fun main(){
    val greetings= arrayOf("Hola","Hi","Bienvenido")
    var a= 1..3
    println(1..3)
    println(a)
    println(1.rangeTo(3))
    println('a'.rangeTo('d'))

    for (n in 1..3){
        println(n)
    }
    println('\n')
    for(greeting in greetings){
        println(greeting)
    }
    println("\n ..")
    for(i in 'a'..'z'){
        println(i)
    }
    println("\n downto")
    for(i in 'c'.downTo('a')){
        println(i)
    }
    println("\n Step")
    for(i in 0..10 step 2){
        println(i)
    }
    println("\n Indices")
    for(i in greetings.indices){
        println(i)
        println(greetings[i])
    }
    println("\n Size")
    for(i in 0..greetings.size-1){
        println(i)
        println(greetings[i])
    }
    println("\n until")
    for(i in 0 until greetings.size){
        println(i)
        println(greetings[i])
    }
    println("\n until with step")
    for(i in 0 until greetings.size step 2){
        println(i)
        println(greetings[i])
    }
}