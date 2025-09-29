import java.util.Scanner;

public class Exercício1 {

//“Olá, Mundo” modificado
//Peça para o usuário inserir o nome dele via Scanner.
//Imprima: Olá, <nome>! Seja bem-vindo ao Java.

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Olá, " + nome + "! Seja bem-vindo ao Java.");

        sc.close();
    }
}