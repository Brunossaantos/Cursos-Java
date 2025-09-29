public class Exercício2 {

    //  Soma de dois números
//Leia dois números inteiros do usuário.
//Calcule e imprima a soma, a subtração, a multiplicação e a divisão (como inteiro e como double).
//Trate o caso de divisão por zero (imprima mensagem de erro). 
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println("Soma: " + (a + b));
        System.out.println("subtração: " + (a - b));
        System.out.println("multiplicação: " + (a * b));
        System.out.println("divisão inteira: " + (a / b));
        System.out.println("divisão double: " + ((double) a / b));
        if (b == 0) {
        }
        else {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
      

        
    }
}