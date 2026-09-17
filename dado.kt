import kotlin.random.Random

fun main() {
    // Sorteia um número de 1 a 6 (o limite superior é exclusivo, por isso usamos 7)
    val numeroSorteado = Random.nextInt(1, 7)
    
    println("O número sorteado foi: $numeroSorteado")
}
