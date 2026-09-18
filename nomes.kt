fun main() {
    // aqui sao as listas de nomes e sobrenomes do codigo... o (val) significa variável imutável
    val nomes = listOf("Ana", "Bruno", "Carlos", "Diana", "Eduardo", "Fernanda")
    val sobrenomes = listOf("Silva", "Santos", "Oliveira", "Souza", "Pereira", "Costa")

    // aqui ele faz o sorteio de cada variavel
    val nomeSorteado = nomes.random()
    val sobrenomeSorteado = sobrenomes.random()

    // aqui ele ajunta o nome e sobrenome dos que foram sorteados 
    val nomeCompleto = "$nomeSorteado $sobrenomeSorteado"

    println("Nome completo gerado: $nomeCompleto")
}
