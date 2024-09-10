fun main() {
    //2.Crie uma array de planetas que inclua "Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno"  e, em seguida, peça ao usuário para digitar o nome de um planeta.
    //Verifique se o planeta que o usuário informou está na array e informe ao usuário.

    val planeta = listOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")
    println(" Qual o nome do planeta:")
    val planetadigitado = readLine()
    if (planetadigitado in (planeta))
    {
        println("Planeta $planetadigitado já tá na lista.")
    }
 else println("O planeta  $planetadigitado não está na lista.")}


