public class Exercício7 {
   // Fatorial
   // Leia um inteiro N >= 0.
   // Calcule N! (fatorial).
   // Imprima o resultado.

   public static void main(String[] args) {
        int n = 5;
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
             fatorial *= i;
        }
        System.out.println("O fatorial de " + n + " é: " + fatorial);
        int i = 1;

        fatorial = 1;
        while (i <= n) {
             fatorial *= i;
             i++;
        }
        System.out.println("O fatorial de " + n + " é: " + fatorial);
      
   }
}
