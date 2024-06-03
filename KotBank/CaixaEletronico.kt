fun main() {
    val titular = Titular(nome = "John Doe", cpf = "4135670981")
    val contaCorrente = ContaCorrente(titular = titular, agencia = "2323-0", conta = "445533-1")
    
    val titularDestino = Titular(nome = "Mary Doe", cpf = "4734082731")
    val contaDestino = ContaCorrente(titular = titularDestino, agencia = "7788-0", conta = "112222-3")
    
    contaCorrente.depositar(valor = 1000.00)
    contaCorrente.sacar(valor = 500.00)
    // contaCorrente.transferir(valor = 500.00, contaDestino = contaDestino)
}