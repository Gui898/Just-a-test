import java.util.Scanner;
public class Algo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome = "Guilherme Henrique Gomes";
		String conta = "Corrente";
		double valor = 1200;
		int num = 0;
		
		System.out.println("**********************************************");
		System.out.println("Dados iniciais do cliente");
		System.out.println();
		System.out.println();
		
		System.out.printf("Nome: %s\n", nome);
		System.out.printf("Tipo da conta: %s\n", conta);
		System.out.printf("Saldo inicial: %s\n", valor);
		
		System.out.println();
		System.out.println("**********************************************");
		
		String opcoes = """
				Operações:
				
				Aperte 1 para: Ver o saldo
				Aperte 2 para: Depositar
				Aperte 3 para: Sacar
				Aperte 4 para: Sair
				""";
		
		while(num != 4) {
			System.out.println(opcoes);
			System.out.println("Digite um número conforme as operações...");
			num = scan.nextInt();
			
			switch(num) {
				case 1:
					System.out.println("Você tem R$" + valor);
					System.out.println();
					break;
					
				case 2: 
					System.out.println("Quanto você quer depositar?");
					double deposit = scan.nextDouble();
					if(deposit > 0) {
						valor += deposit;
					}
					System.out.println("Saldo atualizado: R$" + valor);
					System.out.println();
					break;
					
				case 3:
					System.out.println("Quanto você quer sacar?");
					double wd = scan.nextDouble();
					if(wd > 0 && wd <= valor) {
						valor -= wd;
						System.out.println("Saldo atualizado: R$" + valor);
						System.out.println();
					}else {
						System.out.println("Você não pode sacar mais do que tem!!!");
						System.out.println();
					}
					break;
					
				default:
					break;
			}
		}
		
		  
		
		
		scan.close();
	}

}
