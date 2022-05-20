package split

fun main(){
    val superMarket = listOf(
        "Milk",
        "Eggs",
        "Juide",
        "Meat",
        "Rice"
    )
    //n primeros elementos
    val breakfast =superMarket.take(3)
        .filterNot {
            //MILK, EGGS, JUICE
            it=="Eggs"
        }
    println(breakfast.joinToString())

    //n ultimos elementos
    val dinnerList =superMarket.drop(3)
    println(dinnerList)
}