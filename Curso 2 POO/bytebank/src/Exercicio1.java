//Classe Conta Bancária

//Crie uma classe Conta com:

//atributos: numero, titular, saldo;

//métodos: depositar(double valor), sacar(double valor), exibirSaldo().

//No main, crie uma conta, deposite R$100, saque R$30 e mostre o saldo.


public class Exercicio1 {
    
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.numero = 5555;
        minhaConta.titular = "Bruno Santos";
        
        minhaConta.deposita(100.0);
        minhaConta.saca(30.0);
        minhaConta.exibirSaldo();
    }
    
}
