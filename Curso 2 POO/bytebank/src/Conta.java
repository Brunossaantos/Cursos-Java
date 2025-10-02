class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;
    String cpf;
    String profissao;

    public void deposita(double valor) {
        saldo = saldo + valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean trasfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + this.saldo);
    }
    

}