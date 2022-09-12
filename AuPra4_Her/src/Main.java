import java.util.Scanner;

public class Main {
	public static Sistema sistema = new Sistema();
	public static Scanner scan = new Scanner(System.in);
	
	public static void CadastrarConta() {
		int cpf;
		float saldo;
		System.out.println("CPF do Dono: ");
		cpf = scan.nextInt();
		scan.nextLine();
		System.out.println("Saldo da Conta: ");
		saldo = scan.nextInt();
		scan.nextLine();
		ContaBancaria conta = new ContaBancaria(cpf, saldo);
		sistema.cadastrarConta(conta);
	}
	
	public static void imprimirContas(String tipoConta) {
		if (tipoConta == "Bancaria") {
			ContaBancaria[] contas = sistema.getContas();
			for (int i=0;i<64;i++) {
				if (contas[i] != null) {
					System.out.println(contas[i].gerarExtrato());
				}else {
					break;
				}
			}
		}else if(tipoConta == "Corrente") {
			ContaCorrente[] contas = sistema.getContasCorrentes();
			for (int i=0;i<64;i++) {
				if (contas[i] != null) {
					System.out.println(contas[i].gerarExtrato());
				}else {
					break;
				}
			}
		}else if (tipoConta == "Salario") {
			ContaSalario[] contas = sistema.getContasSalario();
			for (int i=0;i<64;i++) {
				if (contas[i] != null) {
					System.out.println(contas[i].gerarExtrato());
				}else {
					break;
				}
			}
		}
	}
	
	public static void sacar() {
		System.out.println("Digite o CPF:");
		int cpf = scan.nextInt();
		scan.nextLine();
		
	}
	
	public static void deposito() {
		
	}
	
	public static void imprimirExtrato() {
		System.out.println(sistema.obterExtrato(null));
	}
	
	public static void main(String args[]) {
		
	}
}
