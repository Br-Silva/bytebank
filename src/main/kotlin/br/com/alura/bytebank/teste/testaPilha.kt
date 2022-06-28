package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.SaldoInsuficienteException

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