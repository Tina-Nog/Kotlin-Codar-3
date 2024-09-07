fun main (){
    //10 - Escreva um programa para imprimir todas as tabuadas de 1 a N. N será informado pelo usuário.
var n=0
    var j=10
    println("Qual o número da tabuada:")
    n= readln().toInt()
    for (i in 1..n) {
        println("Tabuada de $i:")
        for (j in 1..10) {
            println("$i x $j = ${i * j}")
        }
        println()
    }
}



