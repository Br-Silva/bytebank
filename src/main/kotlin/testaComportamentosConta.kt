fun testaComportamentosConta() {
    val contaBruno = Conta(titular = "Bruno", numero = 1000)
    contaBruno.deposita(100.0)

    println(contaBruno.titular)
    println(contaBruno.numero)
    println(contaBruno.saldo)

    val contaNanna = Conta(numero = 1001, titular = "Nanna")
    contaNanna.deposita(4000.0)

    println(contaNanna.titular)
    println(contaNanna.numero)
    println(contaNanna.saldo)

    println("depositando na conta do Bruno")
    contaBruno.deposita(50.0)
    println(contaBruno.saldo)

    contaNanna.deposita(70.0)
    println("depositando na conta da Nanna")
    println(contaNanna.saldo)

    println("Sacando na conta do Bruno")
    contaBruno.saca(75.0)
    println(contaBruno.saldo)

    println("sacando na conta da Nanna")
    contaNanna.saca(700.0)
    println(contaNanna.saldo)

    println("saque em excesso na conta do Bruno")
    contaBruno.saca(7000.0)
    println(contaBruno.saldo)

    println("saque em excesso na conta da Nanna")
    contaNanna.saca(3400.0)
    println(contaNanna.saldo)

    println("Transferência da conta da Nanna para o Bruno")

    if (contaNanna.transfere(destino = contaBruno, valor = 75.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaBruno.saldo)
    println(contaNanna.saldo)
}
