package Arrays

fun main(){
    //saludo+Introduccion+Nombres
    //Saludo:Hola,hi,Bienvenido,
    //Introduccion: puedes llamarme, que paso, hola
    //Nombre: Luis, Octavio, Luocz
    val greetings= arrayOf("Hola","Hi","Bienvenido")
    val introductions= arrayOf("Puuedes llamarme","que paso","tu eres")
    val names= arrayOf("Luis","Octavio","Luocz")

    val randIndexGreeting=(Math.random()*greetings.size).toInt()
    val randIndexIntroduction=(Math.random()*introductions.size).toInt()
    val randIndexNames=(Math.random()*names.size).toInt()

    val phrase="${greetings[randIndexGreeting]} ${introductions[randIndexIntroduction]} ${names[randIndexNames]}"
    println(phrase)

}