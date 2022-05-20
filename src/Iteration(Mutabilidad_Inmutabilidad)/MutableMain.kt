package `Iteration(Mutabilidad_Inmutabilidad)`

fun main(){
    println("Mutable LIST")

    val list= listOf<Int>(1,2,3)
    val anotherMutableList:MutableList<Int> = list.toMutableList()
    val mutableList= mutableListOf<Int>(1,2,2,3)
    mutableList.add(4)
    mutableList[2]=3
    mutableList.removeAt(3)

    mutableList.forEach {
        println(it)
    }
    val mutableSet = mutableSetOf("Luis","Octavio", "Luocz","Luis")
    mutableSet.forEach {
        println(it)
    }

    val mutableMap= mutableMapOf(
        1 to "Luocz",
        2 to "Luis",
        3 to "Octavio",
        4 to "Luocz"
    )
    mutableMap[5]="Andres"
    mutableMap.forEach {
        val item=it.key
        val name=it.value
        println("$item. $name")
    }

}