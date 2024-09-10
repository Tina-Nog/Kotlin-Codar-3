fun main() {
    //3.Vamos criar uma lista de compras.
    // Crie uma array de frutas, exiba-a ao usuário e, em seguida, peça ao usuário para digitar o nome de uma das frutas.
    // Caso a fruta esteja no array, remova-a e exiba a mensagem "Fruta foi retirada da lista".
    //Peça novamente para o usuário digitar o nome de uma fruta para ser removida.
    // Sempre que o usuário procurar por uma fruta que não está no array exiba a mensagem "Fruta indisponível no nosso mercado".
    // Quando o array não possuir mais itens dentro de si, escreva "Lista de compras finalizada".

    val listaDeComprasFrutas = mutableListOf("Banana", "Morango", "Maça", "Uva.")

    while (listaDeComprasFrutas.isNotEmpty()){
        println(" Fruta na lista disponível $listaDeComprasFrutas:")
    val frutanalista = readLine()
if (frutanalista!=null)
    if (frutanalista in (listaDeComprasFrutas)) {
        listaDeComprasFrutas.remove(frutanalista)
        println("Fruta removida da lista")
    } else {
        println("Fruta indisponível no nosso mercado.")

    }
        println("Lista de compras finalizada")}
    }





