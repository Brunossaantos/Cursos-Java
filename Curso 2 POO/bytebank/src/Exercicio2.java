//Classe Produto

//Crie uma classe Produto com:

//atributos: nome, preco, quantidade;

//método: calcularTotal() que retorna preco * quantidade.

//No main, crie 2 produtos e mostre o valor total de cada um

public class Exercicio2 {
     public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "ps5";
        produto1.preco = 3000.0;
        produto1.quantidade = 1;

        Produto produto2 = new Produto();
        produto2.nome = "ps4";
        produto2.preco = 2000.0;
        produto2.quantidade = 1;

        System.out.println(produto1.nome + " total: R$ " + produto1.calcularTotal());
        System.out.println(produto2.nome + " total: R$ " + produto2.calcularTotal());
    }
}
