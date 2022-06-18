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
