package predicates

fun main(){
    val ages = listOf(15,16,20,25,13)
    val adultages = ages.filter {
        println(it+2)
        it>18
    }
    println(adultages)

    val kidsAges =ages.filterNot {
        it>18
    }
    println(kidsAges)

    val allAges = ages.partition {
        it>18
    }
    println(allAges)
    val adultages2 =allAges.first
    val kidsAges2 = allAges.second
    println(adultages2)
    println(kidsAges2)

    val data = listOf("One", null, "two", null, null)
     val dataNotNull = data.filterNotNull()
    println(dataNotNull)


}