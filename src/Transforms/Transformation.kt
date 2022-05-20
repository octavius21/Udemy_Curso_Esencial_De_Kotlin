package Transforms

fun main(){
    val lenguages = listOf(
        "Java",
        "C",
        "C#",
        "Kotlin"
    )
    //Language: JAva
    //for
    //"Language Java" newList.add
    //for newList
    //(String)->(String)

    val strLenguages = lenguages.map {
        "Language: $it"
    }
    strLenguages.forEach {
        println(it)
    }
    //(INT)->(string)
    val numbers = listOf(1,2,3)
    val items = numbers.map {
        "$it. Item"
    }
    println(items)
    println(items.joinToString())


    val data = listOf("1", "2","*", "3", "/") //Sihay un null marca error
    val datanumbers = data.mapNotNull {
        it.toIntOrNull()
    }
    println(datanumbers)
    val sum =datanumbers.sum()
    println(sum)
}