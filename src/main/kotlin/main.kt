fun main() {
    println("Bem-vindo ao Bytebank!")

    val bruno = Funcionario(
        nome = "Bruno",
        cpf = "123.456.789-10",
        salario = 1000.0
    )

    println("nome: ${bruno.nome}")
    println("cpf: ${bruno.cpf}")
    println("salário: ${bruno.salario}")
    println("bonificação: ${bruno.bonificacao()}")

    val nanna = Gerente(
        nome = "Nanna",
        cpf = "098.765.432-10",
        salario = 2000.0,
        senha = 1234
    )

    println("nome: ${nanna.nome}")
    println("cpf: ${nanna.cpf}")
    println("salário: ${nanna.salario}")
    println("bonificação: ${nanna.bonificacao()}")

    if(nanna.autentica(1234)){
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val alex = Diretor(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 4000.0,
        senha = 4000,
        plr = 2000.0
    )

    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salário: ${alex.salario}")
    println("bonificação: ${alex.bonificacao()}")
    println("plr ${alex.plr}")

    if(alex.autentica(4000)){
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

}






