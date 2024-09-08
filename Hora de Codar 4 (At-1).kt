fun main() {
    // 1.Crie um programa onde o usuário possa cadastrar estudantes sem limites, e, em seguida, Se o usuário digitar "PARE" o programa deve exibir a quantidade de estudantes cadastrados e a lista com cada um deles.

    var estudantes = 0
    val alunos="PARE"
    while (true) {
        println("Digite o nome do estudante :")
        val alunos = readLine()
        estudantes = estudantes + 1

        if (alunos == "PARE") {
            println("\n  Estudantes cadastrados: ${alunos}")
            println("Quantidade de alunos cadastrados:${estudantes}")
            break
        }

        }
    }




