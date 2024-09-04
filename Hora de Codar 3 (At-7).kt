fun main (){
    // 7 - Escreva um algoritmo para ler as notas de avaliações de um aluno, calcule e imprima a média (simples) desse aluno.
    // Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. São 6 notas ao total.
//Caso o valor informado para qualquer uma das notas esteja fora do limite estabelecido, deve ser solicitado um novo valor ao usuário.

    var soma=0
    var nota=0
    var cont=1
    while (cont <=6){
        println("Informe a nota $cont:")
        val cont= readln().toDouble()
    }

    if (nota >0 || nota < 10){
        soma=soma+nota
        cont=cont+1
    }
    else{
        println("Nota invalida! Informe uma nota entre 0 e 10")
    }
    var media=soma /6

    println("A sua média é:$media")
}