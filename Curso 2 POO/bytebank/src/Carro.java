public class Carro {
    String marca;
    String modelo;
    int ano;
    int velocidadeAtual;

    void acelerar(int valor) {
        velocidadeAtual += valor;
        System.out.println("Velocidade: " + velocidadeAtual + " km/h");
    }

    void frear(int valor) {
        velocidadeAtual -= valor;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
        System.out.println("Velocidade: " + velocidadeAtual + " km/h");
    }
    
}
