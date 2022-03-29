package Arrays

fun main(){
    val MyArray= arrayOf(1,"hola",true,'c',21.5f)
    println(MyArray[1])
    MyArray[2]="adios"
    println(MyArray[2])
    val emptyArray= emptyArray<Int>()
    val intArray= intArrayOf()
    val byteArray= byteArrayOf()//puede estar vacio o los elementos
    val numeros=IntArray(4)
    val floats=FloatArray(3)
    val floats_comportamientos=IntArray(3,{i: Int ->i.inc()})//comportamientos son lambdas //es el indice incrementado
    floats_comportamientos.forEach {
        println(it)}

    val boolean_comportamientos=BooleanArray(3){i->
    println("indice "+i)
        true
    }
    boolean_comportamientos.forEach {
        println("valor "+it)
    }
}