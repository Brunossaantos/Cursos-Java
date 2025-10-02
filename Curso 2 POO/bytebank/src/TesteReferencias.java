public class TesteReferencias {
    public static void main(String[] args) {
        Conta PrimeiraConta = new Conta();
        PrimeiraConta.saldo = 300;

        System.out.println("Saldo da PrimwiraConta: " + PrimeiraConta.saldo);

        Conta SegundaConta = PrimeiraConta;
        System.out.println("Saldo da SegundaConta: " + SegundaConta.saldo);

        SegundaConta.saldo += 100;
        System.out.println("Saldo da SegundaConta após depósito: " + SegundaConta.saldo);

        
    }
}
