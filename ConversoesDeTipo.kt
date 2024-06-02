/* 
    Utilização de smart cast, cast e cast seguro
    Criação: 02JUN24 02:15 AM
*/

fun main() {
    var string = "xpto"
    var int = 123

    println(string as String)
    // retorno de exceção do tipo 'ClassCastException'
    //println(int as String)
    println(string as? String)
    println(int as? String)

    if(string is String) println("variavel 'string' eh do tipo String")
    
    if(int is String) 
        println("variavel string eh do tipo String")
    else 
        println("variavel 'int' nao eh do tipo string")
}