
fun main() {
    // 1 - Escreva um algoritmo para ler 2 valores informados pelo usuário e se o segundo valor informado for igual ou menor que ZERO, deve ser lido um novo valor.
    //u seja, para o segundo valor não pode ser aceito o valor zero, nem um valor negativo.
    //O seu programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor e exibir o resultado ao usuário.

    println(" Quais são os valores!")
    println("Informe o valor1:")
    var valor1 = readln().toInt()
    println("Informe o valor2:")
    var valor2 = readln().toInt()
    while(valor2<=0){
        println(" Número invalido! Informe um valor que é igual ou menor a zero")
        var valor2 = readln().toInt()
    }
    if (valor2>0){
        var total=(valor1/valor2)
        println("O resultado é: $total")
    }
}