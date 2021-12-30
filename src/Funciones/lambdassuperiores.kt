package Funciones

fun  main(){
    val isvalid=isvalid(5,{
        it>4
    })
    //Otra forma
//    val isvalid=isvalid(5) {
//        it > 4
//    }
    println(isvalid)

    //otra forma para la de abajo
    val aux=consultProductId {
        it
        //Nav campo
        //Intent
        //Cambiar de Ventana
        getOnNextBehavior()
    }
    println("****** *****")

    consultProductId (getOnNextBehavior())
    //otra forma
    consultProductId(onNext = getOnNextBehavior())


}
fun isvalid(x:Int, validate:(x:Int)->Boolean):Boolean{
    return validate(x)
}
fun consultProductId(onNext:(productId:String)->Unit){
    //BD
    //Api
    val productId="WEART123"
    onNext(productId)
}
fun getOnNextBehavior():(productId:String)->Unit{
    return{
        println("GotoProduct Detail screen with product Id:$it")
    }
}