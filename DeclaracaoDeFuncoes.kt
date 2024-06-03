/*
    Declaração de funções, inline function, default arguments, named arguments
    Criação: 02JUN24 04:02 AM
*/

fun main() {
    // Declaração de variáveis
    var texto: String = "Hello Kotlin"

    imprimirTexto(null)
    imprimirTextoInline(texto)
    imprimirArgumentoPadrao()

    // Named arguments
    imprimirTexto(texto="texto teste do named arguments")

    println(toList("xpto1", "xpto2", "xpto3", "xpto4"))

    var lista = arrayOf("a", "b", "c")
    println(toList(*lista))

    println(toList<String>("a", "b", "c"))
}

// Parâmetro não obrigatório, operador ternário, sem retorno
fun imprimirTexto(texto: String?): Unit {
    if (texto != null) println(texto) else println("Nenhum texto passado no parametro.")
}

fun imprimirTextoInline(mensagem: String) = println(mensagem)

// Default arguments
// (mensagem: String = "default argument")
fun imprimirArgumentoPadrao(mensagem: String = "Argumento padrao") = println(mensagem)

// Diversos parâmetros em única variável: 'vararg'
fun toList(vararg args: String): List<String> {
    var list = ArrayList<String>()

    for (s in args)
        list.add(s)

    return list
}

// Tipos genéricos
fun <T> toList(vararg args: T): List<T> {
    var list = ArrayList<T>()
    return list
}