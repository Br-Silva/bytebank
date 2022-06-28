import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val bruno = Cliente(nome = "Bruno", cpf = "", senha = 1)

    val contaBruno = ContaCorrente(titular = bruno, numero = 1000)
    contaBruno.deposita(100.0)

    println(contaBruno.titular)
    println(contaBruno.numero)
    println(contaBruno.saldo)

    val nanna = Cliente(nome = "Nanna", cpf = "", senha = 2)

    val contaNanna = ContaPoupanca(numero = 1001, titular = nanna)
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

    try {
        contaNanna.transfere(destino = contaBruno, valor = 75.0, senha = 2)
        println("Transferência sucedida")
    } catch (e: SaldoInsuficienteException){
        println("Falha na transferência")
        println("Saldo Insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException){
        println("Falha na transferência")
        println("Falha na autenticação")
        e.printStackTrace()
    }

    println(contaBruno.saldo)
    println(contaNanna.saldo)
}
