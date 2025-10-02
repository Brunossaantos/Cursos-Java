//Classe Carro

//Crie uma classe Carro com:

//atributos: marca, modelo, ano, velocidadeAtual;

//métodos:

//acelerar(int valor) (aumenta a velocidade);

//frear(int valor) (diminui a velocidade, mas não pode ser negativa).

//No main, crie um carro, acelere e freie, mostrando a velocidade a cada ação.


public class Exercicio4 {
     public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Golf";
        carro.modelo = "GTI";
        carro.ano = 2008;

        carro.acelerar(40);
        carro.acelerar(15);
        carro.frear(30);
        carro.frear(60);
    }
}
