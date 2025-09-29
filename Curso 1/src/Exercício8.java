public class Exercício8 {
// Verificar número primo
//Leia um inteiro N > 1.
//Verifique se é primo (divisível apenas por 1 e por ele mesmo).
//Imprima: N é primo ou N não é primo.

public static void main(String[] args) {
    int[] numeros = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    for (int n : numeros) {
        boolean isPrimo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrimo = false;
                break;
        }
    }
    if (isPrimo) {
        System.out.println(n + " é primo.");
    } else {
        System.out.println(n + " não é primo.");
    }
    
}
}
    
}
