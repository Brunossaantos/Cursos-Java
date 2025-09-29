public class Exercício10 {

                // Menu com opções simples
    // Monte um pequeno programa com menu, tipo:
    // 1. Soma
    // 2. Subtração
    // 3. Multiplicação
    // 4. Divisão
    // 0. Sair

    public static void main(String[] args) {
        int opcao = 1; 

        do {
            System.out.println("Menu:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");
            
            // Simulando
            opcao = 3; 
        } while (opcao < 0 || opcao > 4);


        int a = 10;
        int b = 5;
        switch (opcao) {
            case 1:
                System.out.println("Soma: " + (a + b));
                break;
            case 2:
                System.out.println("Subtração: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplicação: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Divisão: " + (a / b));
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
        }
        
    }
}
