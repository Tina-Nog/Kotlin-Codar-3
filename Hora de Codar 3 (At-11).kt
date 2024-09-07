fun main (){
    // 11 - Escreva um programa em que o usuário informe 10 valores
    // e escreva quantos desses valores lidos estão entre os números 24 e 42
    //(incluindo os valores 24 e 42) e quantos deles estão fora deste intervalo.

    var dentroDointervalo=0
    var foraDointervalo=0
var i=1
    while (i<=10){
        println(" Digite o valor $i:")
        var v= readln().toInt()
        if  (v>=24 && v<=42){
            dentroDointervalo=dentroDointervalo +1}
        else {
            foraDointervalo = foraDointervalo + 1
        }
            i=i+1

        println("Quantidade de dentro valores  24 e 42:$dentroDointervalo")
        println("  Quantidade  fora dos valores 24 e 42:$foraDointervalo")
    }
}




