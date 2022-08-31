package apresentacao;

import java.util.Scanner;

import dados.*;
import negocio.*;

public class Principal {
	public static Scanner scanner = new Scanner(System.in);
	public static ReservaPassagem reservaPassagem = new ReservaPassagem();
	
	public void cadastrarCliente() {
		Cliente cliente = new Cliente();
		System.out.println("CADASTRO DE CLIENTES");
		System.out.println("NOME: ");
		cliente.nome = scanner.nextLine();
		System.out.println("ENDERECO: ");
		cliente.endereco = scanner.nextLine();
		System.out.println("ENDERECO: ");
		cliente.telefone = scanner.nextInt();
		System.out.println("ENDERECO: ");
		cliente.cpf = scanner.nextInt();
		scanner.nextLine();
		reservaPassagem.cadastrarCliente(cliente);
	}
	
	public void cadastrarCidade() {
		Cidade cidade = new Cidade();
		System.out.println("CADASTRO DE CIDADES");
		System.out.println("NOME: ");
		cidade.nome = scanner.nextLine();
		System.out.println("ESTADO: ");
		cidade.estado = scanner.nextLine();
		reservaPassagem.cadastrarCidade(cidade);
	}
	
	public void fazerReserva() {
		Reserva reserva = new Reserva();
		Cliente[] clientes = new Cliente[64];
		System.out.println("RESERVAS: ");
		clientes = reservaPassagem.mostrarClientes();
		for (int i=0;i<reservaPassagem.getnClientes();i++) {
			System.out.println(i + " - " + clientes[i].nome);
		}
		System.out.println("Digite o número do cliente: ");
		int escolha= scanner.nextInt();
		scanner.nextLine();
		Cliente clienteEscolhido = clientes[escolha];
		
		System.out.println("IDA: ");
		System.out.println("DATA DO VOO: ");
		reserva.dataVoo = scanner.nextLine();
		System.out.println("HORA DO VOO: ");
		reserva.horaVoo = scanner.nextLine();
		System.out.println("PRECO: ");
		reserva.preco = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("CLASSE: ");
		reserva.classeVoo = scanner.nextLine();
		System.out.println("POLTRONA: ");
		reserva.poltrona = scanner.nextInt();
		scanner.nextLine();

		System.out.println("VOLTA: ");
		System.out.println("DATA DO VOO: ");
		reserva.volta.dataVoo = scanner.nextLine();
		System.out.println("HORA DO VOO: ");
		reserva.volta.horaVoo = scanner.nextLine();
		System.out.println("PRECO: ");
		reserva.volta.preco = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("CLASSE: ");
		reserva.volta.classeVoo = scanner.nextLine();
		System.out.println("POLTRONA: ");
		reserva.volta.poltrona = scanner.nextInt();
		scanner.nextLine();
		
		reservaPassagem.reservar(clienteEscolhido, reserva);
	}
	
	public void mostrarReservas() {
		int cpf;
		System.out.println("MOSTRAR RESERVAS: ");
		System.out.println("DIGITE O CPF DO CLIENTE: ");
		cpf = scanner.nextInt();
		scanner.nextLine();
		Reserva reservas[] = reservaPassagem.mostrarReservas(cpf);
		for (int i=0;i<reservaPassagem.getClientePorCpf(cpf).getnReservas();i++) {
			System.out.println(reservas[i].toString());
		}
	}
	
	public static void main(String args[]) {
		
	}
}
