package Condiciones

fun main(){
    val istrue=true
    val isfalse=false
    var isindeterminate:Boolean
    var minvalue=if(isfalse!=istrue) isfalse else istrue
    println(minvalue)
    if(istrue==isfalse){
        isindeterminate=true
    }else{
        isindeterminate=false
    }
    println(isindeterminate)
    if(isfalse==istrue){
        isindeterminate=false
    }else if(istrue!=istrue){
        isindeterminate=true
    }else{
        isindeterminate=false
    }
    println(isindeterminate)
}