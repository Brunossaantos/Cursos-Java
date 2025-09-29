public class Exercício9 {
    // Sequência de Fibonacci

    // Leia um inteiro N (quantidade de termos).

    // Imprima os N primeiros termos da sequência de Fibonacci (começando 0, 1, 1,
    // 2, 3, …).
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }

    }

}
