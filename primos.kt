import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Digite a quantidade de números primos (N): ")
    
    // aqui o puto do usuario vai colocar o numero e o programa vai guardar dentro do celebro
    val n = scanner.nextInt()
    // aqui a baixo eu nao etendi porra nenhuma mas pelo que o copilot me falou ele meio q ele serve como placar pra o programa ter conciencia de quais numeros primos ja foram e quais tem ainda (muitos pq os numeros sao infinitos mais ok)
    var contadorPrimosEncontrados = 0
    var numeroAtual = 2 // O primeiro número primo é o 2

    println("Os primeiros \$n números primos são:")

    // aqui parece que o querido imprime uma mensagem e o $n ele substitui o texto pelo valor real, o q é isso, nao entendi bolhufas mas acho que pode ser o numero 
    while (contadorPrimosEncontrados < n) {
        if (ehPrimo(numeroAtual)) {
            print("\$numeroAtual ")
            contadorPrimosEncontrados++
        }
        numeroAtual++
    }
}

// Função auxiliar para verificar se um número é primo
fun ehPrimo(numero: Int): Boolean {
    if (numero < 2) return false
    
    // Verifica divisores de 2 até a raiz quadrada do número
    var i = 2
    while (i * i <= numero) {
        if (numero % i == 0) {
            return false // Se for divisível por qualquer número, não é primo
        }
        i++
    }
    return true
}
