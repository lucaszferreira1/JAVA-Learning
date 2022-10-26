package apresentacao;

import java.util.Scanner;

import negocio.ListaTelefonica;

public class Main {
	public static ListaTelefonica listaTel = new ListaTelefonica();
	public static Scanner scan = new Scanner(System.in);
	
	private static void showAllContacts() {
		System.out.println(listaTel.listarContatos());
	}
	
	private static void showAllLetterContacts() {
		System.out.println("Digite a letra a ser pesquisada: ");
		String letra = scan.nextLine();
		System.out.println(listaTel.buscarContatos(letra.charAt(0)));	
	}
	
	public static void main(String args[]) {
		System.out.println("1 - Listar a Lista Telefônica");
		System.out.println("2 - Listar todos os Contatos com Letra");
		int escolha = scan.nextInt();
		scan.nextLine();
		switch (escolha) {
			case 1:
				showAllContacts();
			case 2:
				showAllLetterContacts();
		}
	}
}
