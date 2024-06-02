/*
    Declaração de funções
    Criação: 02JUN24 04:02 AM
*/

fun main() {
    // Declaração de variáveis
    var texto: String = "Hello Kotlin"
    var texto2: String = "Hello Kotlin Function Inline"
    var inteiro: Int = 0

    imprimirTexto(null)
    imprimirTexto(texto)
    imprimirTextoInline(texto2)
    imprimirInteiro(inteiro)
}

// Função imprimirTexto com parâmetro não obrigatório 
// e utilização do operador ternário
fun imprimirTexto(texto: String?): Unit {
    if (texto != null) println(texto) else println("Nenhum texto passado no parametro.")
}

fun imprimirTextoInline(mensagem: String) = print(mensagem)

// Função imprimirInteiro exige parâmetro numérico
fun imprimirInteiro(inteiro: Int): Unit {
    println(inteiro)
}