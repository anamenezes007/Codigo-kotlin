fun main() {
    // Listas com exemplos de nomes e sobrenomes
    val nomes = listOf("Ana", "Bruno", "Carlos", "Diana", "Eduardo", "Fernanda")
    val sobrenomes = listOf("Silva", "Santos", "Oliveira", "Souza", "Pereira", "Costa")

    // Sorteia um elemento de cada lista
    val nomeSorteado = nomes.random()
    val sobrenomeSorteado = sobrenomes.random()

    // Junta os dois para formar o nome completo
    val nomeCompleto = "$nomeSorteado $sobrenomeSorteado"

    println("Nome completo gerado: $nomeCompleto")
}
