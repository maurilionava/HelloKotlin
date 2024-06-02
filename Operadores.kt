/*
    Operadores ternário e elvis
    Criação: 02JUN24 02:32 AM
*/

fun main() {
    var par: Int = 2
    var impar: Int = 3
    var titulo = null
    
    // Operador ternário em Java
    //(aux <= 0) ? "sim" : "nao"
    
    // Operador ternário em Kotlin
    if (par%2 == 0) println("${par} eh par") else println("${impar} eh impar")
    if (impar%2 == 0) println("${par} eh par") else println("${impar} eh impar")

    // Operador Elvis
    println(titulo ?: "Titulo nulo")
}