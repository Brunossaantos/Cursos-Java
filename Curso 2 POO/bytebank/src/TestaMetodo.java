public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoBruno  = new Conta();
        contaDoBruno.saldo = 100;
        contaDoBruno.deposita(50);
        System.out.println(contaDoBruno.saldo);
        
        boolean conseguiRetirar = contaDoBruno.saca(20);
        System.out.println(contaDoBruno.saldo);
        System.out.println(conseguiRetirar);
        boolean naoConseguiRetirar = contaDoBruno.saca(500);
        System.out.println(contaDoBruno.saldo);
        System.out.println(naoConseguiRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        boolean sucessoTransferencia = contaDaMarcela.trasfere(300, contaDoBruno);
        if(sucessoTransferencia) {
            System.out.println("Transferência com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }
    }
}
