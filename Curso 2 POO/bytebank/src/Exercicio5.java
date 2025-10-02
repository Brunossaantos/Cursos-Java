//Crie uma classe Livro com:

//atributos: titulo, autor, paginas;

//método: exibirInformacoes() que imprime os dados do livro.

//No main, crie uma lista de 3 livros e mostre as informações de cada um.

public class Exercicio5 {
     public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.titulo = "Diario de um banana";
        l1.autor = "Jeff Kinney";
        l1.paginas = 217;

        Livro l2 = new Livro();
        l2.titulo = "Clean Code";
        l2.autor = "Robert C. Martin";
        l2.paginas = 464;

        Livro l3 = new Livro();
        l3.titulo = "A culpa é das estrelas";
        l3.autor = "John Green";
        l3.paginas = 313;

        l1.exibirInformacoes();
        l2.exibirInformacoes();
        l3.exibirInformacoes();
    }
    
}
