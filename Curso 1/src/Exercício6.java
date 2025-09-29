public class Exercício6 {
//Soma de 1 até N (usando loop)
//Leia um inteiro N > 0.
//Use um for ou while para somar todos os números de 1 até N.
//Imprima o resultado.

public static void main(String[] args) {
    int n = 5;
    int soma = 0;
    for (int i = 1; i <= n; i++) {
        soma += i;
    }
    System.out.println("A soma de 1 até " + n + " é: " + soma);
    int i = 1;
    
    soma = 0;
    while (i <= n) {
        soma += i;
        i++;
    }
    System.out.println("A soma de 1 até " + n + " é: " + soma);
}
}
