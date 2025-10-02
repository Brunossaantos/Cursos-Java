//Classe Aluno

//Crie uma classe Aluno com:

//atributos: nome, nota1, nota2;

//método: media() que retorna a média das notas;

//método: aprovado() que retorna true se a média for >= 7.

//No main, peça o nome e notas de um aluno e mostre se ele foi aprovado.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.print("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.print("Digite a nota da primeira atividade: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Digite a nota da segunda atividade: ");
        aluno.nota2 = sc.nextDouble();

        System.out.println("Média: " + aluno.media());
        if (aluno.aprovado()) {
            System.out.println(aluno.nome + " foi aprovado!");
        } else {
            System.out.println(aluno.nome + " foi reprovado!");
        }

        sc.close();
    }
}
