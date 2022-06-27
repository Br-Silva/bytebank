import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val endereco = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "00000-000",
    )

    val enderecoNovo = Endereco(
        numero = 1000,
        bairro = "Vila Mariana",
        cep = "00000-000",
    )

    println(endereco.equals(enderecoNovo))


}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor
}










