public class Aluno {
    
  
    String nome;
    double nota1;
    double nota2;

    double media() {
        return (nota1 + nota2) / 2;
    }

    boolean aprovado() {
        return media() >= 7;
    }
}
