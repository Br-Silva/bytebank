fun main() {
    println("Bem-vindo ao Bytebank!")

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

class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("João", 1002)
    contaJoao.titular = "João"
    var contaMaria = Conta("Maria", 1003)

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
}

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Bruno $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }

    /*for (i in 5 downTo 1)
        if(i == 3) {
            break
            // continue pularia o número 3
        }

        val titular = "Bruno $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")*/

}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}