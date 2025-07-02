import java.util.Scanner;

public class contaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("         Bem-vindo ao Badresco        ");
        System.out.println("======================================");

        System.out.println("--------------------------------------");
        System.out.print("Por favor, digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Olá, Senhor " + nome);

        System.out.print("Digite a sua Agência (ex: 1234-5): ");
        String agencia = sc.nextLine();

        System.out.print("Perfeito! Agora digite a sua Conta: ");
        int conta = sc.nextInt();
        sc.nextLine();

        System.out.print("Qual o valor que você gostaria de depositar: ");
        String valorStr = sc.nextLine().replace(",", ".");
        double dinheiro = Double.parseDouble(valorStr);

        System.out.println("--------------------------------------");
        System.out.println("======================================");
        System.out.printf("Nome: %s\nAgência: %s\nConta: %d\nValor Depósito: R$ %,.2f\n", nome, agencia, conta, dinheiro);
        System.out.println("======================================");

        sc.close();
    }
}
