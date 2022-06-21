fun testaContasDiferentes() {
    val contaCorrente: Conta = ContaCorrente(
        titular = "Bruno",
        numero = 1000,
    )
    val contaPoupanca: Conta = ContaPoupanca(
        titular = "Nanna",
        numero = 1001,
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo conta corrente: ${contaCorrente.saldo}")
    println("saldo conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque conta corrente: ${contaCorrente.saldo}")
    println("saldo após saque conta poupança: ${contaPoupanca.saldo}")


    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo conta corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo conta poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("saldo conta poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo conta corrente após receber transferência: ${contaCorrente.saldo}")
}
