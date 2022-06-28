import br.com.alura.bytebank.modelo.*

fun testaContasDiferentes() {
    val contaCorrente: Conta = ContaCorrente(
        titular = Cliente(
            nome = "Bruno",
            cpf = "",
            senha = 1,
            endereco = Endereco(
                logradouro = "Rua Vergueiro"
            )
        ),
        numero = 1000,
    )

    println("Titular")
    println("nome do titular: ${contaCorrente.titular.nome}")
    println("cpf do titular: ${contaCorrente.titular.cpf}")
    println("endereço do titular ${contaCorrente.titular.endereco.logradouro}")

    val contaPoupanca: Conta = ContaPoupanca(
        titular = Cliente(
            nome = "Nanna",
            cpf = "",
            senha = 2
        ),
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


    contaCorrente.transfere(100.0, contaPoupanca, 1)

    println("saldo conta corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo conta poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente, 2)

    println("saldo conta poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo conta corrente após receber transferência: ${contaCorrente.saldo}")
}
