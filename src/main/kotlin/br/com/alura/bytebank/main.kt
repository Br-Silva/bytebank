import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Endereco

fun main() {

    testaContasDiferentes()

    println("início main")
    funcao1()
    println("fim main")
}
fun funcao1(){
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        try {
            throw SaldoInsuficienteException()
        } catch (e: SaldoInsuficienteException){
            println("SaldoInsuficienteException foi pegada")
        }
    }
    println("fim funcao2")
}

