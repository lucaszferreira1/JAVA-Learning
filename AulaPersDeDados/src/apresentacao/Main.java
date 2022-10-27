package apresentacao;

import java.util.List;
import java.util.Scanner;

import dados.Contato;
import negocio.ListaTelefonica;

public class Main {
	public static ListaTelefonica listaTel = new ListaTelefonica();
	public static Scanner scan = new Scanner(System.in);
	
	private static void showAllContacts() {
		try {
			int i = 1;
			for (List<Contato> c: listaTel.listarContatos().values()) {
				for (Contato cont : c) {
					System.out.println(i++ + "_" + cont.toString());
				}
			}
		} catch (Exception e) {
			System.err.println("Erro ao Tentar Listar Todos os Contatos");
			System.exit(0);
		}
	}
	
	private static void showAllLetterContacts() {
		try {
			System.out.println("Digite a letra a ser pesquisada: ");
			String letra = scan.nextLine();
			for (Contato c : listaTel.buscarContatos(letra.charAt(0))) {
				System.out.println(c.toString());	
			}
		} catch (Exception e) {
			System.err.println("Erro ao Pesquisar por Letra");
			System.exit(0);
		}
	}
	
	private static void adicionarContato() {
		System.out.println("Nome: ");
		String nome = scan.nextLine();
		System.out.println("Telefone: ");
		int numero = scan.nextInt();
		scan.nextLine();
		listaTel.AdicionarContato(new Contato(nome, numero));
	}
	
	private static void removerContato() {
		showAllContacts();
		System.out.println("Escolha o Número do Contato para Remover: ");
		int escolha = scan.nextInt();
		scan.nextLine();
		listaTel.RemoverContato(listaTel.buscarContatoPorNumero(escolha));
	}
	
	public static void main(String args[]) {
		while(true) {
			System.out.println("1 - Listar a Lista Telefônica");
			System.out.println("2 - Listar todos os Contatos com Letra");
			System.out.println("3 - Adicionar Contato");
			System.out.println("4 - Remover Contato");
			int escolha = scan.nextInt();
			scan.nextLine();
			switch (escolha) {
				case 1:
					showAllContacts();
					break;
				case 2:
					showAllLetterContacts();
					break;
				case 3:
					adicionarContato();
					break;
				case 4:
					removerContato();
					break;
			}
		}
	}
}
