import java.util.Scanner;
public class contaTerminal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("======================================");
		System.out.println("         Bem-vindo ao Badresco        ");
		System.out.println("======================================");
		
		System.out.println("--------------------------------------");
		System.out.println("Porfavor Digite o seu Nome: ");
		String nome = sc.next();
		System.out.println("Olá Senhor "+nome);
		
		System.out.println("Digite a sua Agencia ex '1234-5': ");
		String agencia = sc.next();
		
		System.out.println("Perfeito Agora digite a sua Conta: ");
		int conta = sc.nextInt();
		
		System.out.println("Qual o Valor voce gostaria de depositar: ");
		double dinheiro = sc.nextDouble();
		
		System.out.println("--------------------------------------");
		System.out.println("======================================");
		System.out.printf("Nome %s \nAgencia %s \nConta %d \nValor Deposito : R$ %.2f",nome,agencia,conta,dinheiro);
		System.out.println();
		System.out.println("======================================");
		
	}

}
