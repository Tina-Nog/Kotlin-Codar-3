fun main (){
    // 5 . Conta Bancária

    var saldo=0
    var senhavalida=3589

    println(" Bem-Vindo ao banco Proa Tito!")
    println(" Digite seu nome:")
    val nome = readLine()?.toIntOrNull()
     println(" Olá , $nome é uma prazer ter você aqui!")

}


   fun menu() {
       while (true)
           println(" Selecione uma Operação:")
       println(" 1 -> Saldo")
       println(" 2 -> Extrato")
       println(" 3 -> Saque")
       println("4 -> Depósito")
       println("5 -> Transferêrencia")
       println(" 6 -> Sair")
       println(" Opção:")
       val opcao = readLine().toIntOrNull()

       when (opcao) {
           1 -> verSaldo()
           2 -> verExtrato()
           3 -> Sacar()
           4 -> fazerdeposito()
           5 -> fazerTransferir()
           6 -> Sair(){
               println("$nome, Obrigado por fazer parte do Banco Proa Tito!")
       }
           else -> error(){
   }

    }

}  fun VerSaldo(){
    println(" Insira sua senha:")
    val senhavalida = readln().toInt()
    if(senhavalida==3589){
        println("Seu saldo no momento é: $saldo")
    }
    else{
        println("n Operação não autorizada! Insira novamente sua senha.")
        verSaldo()

    }

}   fun VerExtrato() {
    println(" insira sua senha para ver seu extrato:")
    val senhavalida = readln().toInt()
    if (senhavalida == 3589) {
        println(" Extrato:")
        println(" 05/07 -Transfêrencia R$900")
        println(" 21/07 - Saque R$1.500")
        println("25/07- Depósito R$2.000")
    } else {
        println(" Operação não autorizada")
        VerExtrato()
    }

}    fun Saque() {
    println(" Insira sua senha para realizar o saque:")
    val senhavalida = readln().toInt()
    if (senhavalida == 3589){
        println(" Informe o valor do saque:")
        val saque = readln().toDouble()
    }
    if (saque <= 0) {
        println(" Valor Inválido!")
    } else if (saque > saldo) {
        println("saldo insuficiente")
    } else {
        saldo = saldo - saque
        println("Saque autorizado com sucesso!")
    } else {
        println(" Operação não autorizada")
        Saque()
    }


}   fun Deposito() {
    println(" Insira sua senha para realizar depósito:")
    val senhavalida = readln().toInt()
    if (senhavalida == 3589) {
        val deposito = readln().toDouble()
        println("Qual o valor para depósito:")
    }
    if (deposito <= 0) {
        saldo = saque + deposito
        println(" Depósito realizado com sucesso")
    } else {
        println(" Operação não autorizada.")
        fazerdeposito()
    }

} fun Transferencia() {
    println("Insira a sua senha para realizar Transfêrencia.")
    val senhavalida = readln().toInt()
    if (senhavalida == 3589) {
        val transferencia = readln().toDouble()
        val conta = readln().toInt()
        println("Informe o número da conta para Transfêrencia:")

        if (conta == 2177) {
            println("Qual o valor para a Transfêrencia:")
            val conta = readln().toInt()
        }
        if (transferencia <= 0) {
            println("  Transfêrencia não autorizada.")
        } else if (transferencia > saldo) {
            println(" Operação não autorizada! Saldo Insuficiente.")
        } else {
            saldo = saldo - transferencia
            println("Transferência realizada com sucesso. Novo saldo: R$ $saldo")
            fazertransferencia()
        }
    } else {
        println("Senha incorreta")

    }fun erro() {
        println(" Opecao inválida. Tente novamente.")
        inicio()
    }
} fun sair(){
    println("Obrigado, $nome por fazer parte do Banco Proa Tito.")
    }












