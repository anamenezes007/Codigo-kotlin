import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Digite a quantidade de números primos (N): ")
    
    // Lê o valor de N informado pelo usuário
    val n = scanner.nextInt()
    
    var contadorPrimosEncontrados = 0
    var numeroAtual = 2 // O primeiro número primo é o 2

    println("Os primeiros \$n números primos são:")

    // Continua o loop até encontrar N números primos
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
