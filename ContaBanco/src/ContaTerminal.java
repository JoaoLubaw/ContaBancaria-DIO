import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
			
			Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
			int numero;
			String agencia;
			String nomeCliente;
			double saldo;

			System.out.println("Olá, bem vindo ao Lier, o banco oficial do filme O Primeiro Mentiroso, por favor, digite o número de sua conta: ");
			numero = scanner.nextInt();

			System.out.println("Muito bem, agora preciso do número de sua agência: ");
			agencia = scanner.next();

			System.out.println("Preciso confirmar seu nome: ");
			nomeCliente = scanner.next();
      scanner.nextLine();

			System.out.println("Hmmm, infelizmente ocorreu um erro em nosso sistema, preciso que confirme seu saldo atual: ");
			saldo = scanner.nextDouble();

			System.out.println("Nosso sistema voltou neste meio tempo...estranho, o valor parece diferente... Mas o sistema deve ter se enganado então, afinal, por quê diria algo que não é?");
		
			System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + ". Seu saldo de R$" + saldo + " já está disponível para saque.");
		}
}
