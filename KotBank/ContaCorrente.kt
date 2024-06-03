class ContaCorrente(titular: Titular, agencia: String, conta: String): ContaInterface {
    val titular: Titular = titular
    val agencia: String = agencia
    val conta: String = conta
    var saldo: Double = 0.00
    
    class ContaCorrente constructor() {
        println("Entrou no construtor")
    }

    override fun depositar(valor: Double): Boolean {
        saldo += valor

        println("Deposito realizado")
        return true
    }

    override fun sacar(valor: Double): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            println("Saque realizado")
            return true
        } else {
            println("Saldo insuficiente")
            return false
        }
    }

    // override fun transferir(valor: Double, contaDestino: ContaCorrente): Boolean { 
    //     if(sacar(valor)) {
    //         println("Transferência realizada")
    //         return true
    //     } else {
    //         println("Saldo insuficiente")
    //         return false
    //     }
    // }
}