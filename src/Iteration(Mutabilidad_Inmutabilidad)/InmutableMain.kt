package `Iteration(Mutabilidad_Inmutabilidad)`

fun main(){
    println("LIST")

    val list= listOf<Int>(1,2,3)
    println(list[2])

    list.forEach {
        println(it)
    }

    println()
    println("SET")
    val set= setOf<Int>(1,2,2,3)
    println(set.size)
    set.forEach {
        println(it)
    }
    val setNames = setOf("Luis","Octavio", "Luocz","Luis")
    setNames.forEach {
        println(it)
    }
    val map= mapOf(
        1 to "Luocz",
        2 to "Luis",
        3 to "Octavio",
        4 to "Luocz"
    )

    map.forEach {
        val item=it.key
        val name=it.value
        println("$item. $name")
    }

}