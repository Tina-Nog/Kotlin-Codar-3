fun main(){
    //  6. Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final.
    // Considere que a nota de aprovação é 9,5.
    // Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta.
    // Se a resposta for "S", o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.


    var  aprovados =0

    while(true)
        println("Digite a Primeira nota:")
    var not1 = readln().toDouble()
    println("Digite a Segunda nota:")
    var not2= readln().toDouble()

    var media = not1 + not2 /2

    if (media >= 9.5)
    {
        println("Você foi aprovado!$media")

        aprovados = aprovados + 1}
    else{
        println("  Você foi reprovado!")}

    println("Calcular a média de outro aluno Sim/Não? Selecione : Sim ou Não:")
    var quant= readln()


    if  (quant== "Não"){
        println(" O total de aprovados:$aprovados")

    }

    if (quant== " Sim"){
        println(" O total de aprovados:$aprovados")}


}
