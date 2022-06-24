import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", cpf = "", senha = 1)

    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular.nome = "João"
    val contaMaria = ContaPoupanca(Cliente(
        nome = "Maria",
        cpf = "",
        senha = 2
    ),1003)

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
}
