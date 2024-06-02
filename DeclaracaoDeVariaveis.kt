/* 
    Declaração de variáveis, constantes, listas
        e impressão no console 
    Criação: 02JUN24 01:57 AM
*/

fun main() {
    // Declaração de variáveis
    var varString: String = "conteudo variavel"
    var varInteiro: Int = 123

    val constString: String = "conteudo constante"
    val constInteiro: Int = 321

    // Listas
    var byteList = ArrayList<Int>()
    byteList.add(0)
    byteList.add(1)
    byteList.add(2)
    byteList.add(3)
    byteList.add(4)
    byteList.add(5)
    byteList.add(6)
    byteList.add(7)

    var binaryList: List<Int> = listOf(0, 1)

    // Impressão das variáveis no console
    println(varString)
    println("varInteiro = ${varInteiro}")
    
    println("Quantidade de caracteres da constante 'constString' = ${constString.length}")
    println("constInteiro = ${constInteiro}")

}