package Principal;

import java.util.Scanner;

public class Principal {
	private static Sistema sis = new Sistema();
	private static Scanner in = new Scanner(System.in);
	
	private static void menu() {
		System.out.println("- - - - Menu - - - -");
		System.out.println("0  - Sair");
		System.out.println("1  - Add Arrenda");
		System.out.println("2  - Add Barco");
		System.out.println("3  - Add Camera");
		System.out.println("4  - Add Companhia");
		System.out.println("5  - Add Funcionario");
		System.out.println("6  - Add Incidente");
		System.out.println("7  - Add Local");
		System.out.println("8  - Listar Arrendas");
		System.out.println("9  - Listar Barcos");
		System.out.println("10 - Listar Cameras");
		System.out.println("11 - Listar Companhias");
		System.out.println("12 - Listar Funcionarios");
		System.out.println("13 - Listar Incidentes");
		System.out.println("14 - Listar Locais");
		System.out.println("15 - Alterar Arrenda");
		System.out.println("16 - Alterar Barco");
		System.out.println("17 - Alterar Camera");
		System.out.println("18 - Alterar Companhia");
		System.out.println("19 - Alterar Funcionario");
		System.out.println("20 - Alterar Incidente");
		System.out.println("21 - Alterar Local");
		System.out.println("22 - Listar Barcos Atracados");
		System.out.println("23 - Listar Barcos com Capitão");
		System.out.println("24 - Adicionar Capitão à um Barco");
		System.out.println("25 - Listar Histórico de Capitães de um Barco");
		System.out.println("26 - Listar Barcos no Local escolhido");
	}
	
	public static void main(String args[]) {
		int escolha = 1;
		try {
			while (escolha != 0) {
				
				menu();
				
				escolha = in.nextInt();
				in.nextLine();
				switch(escolha) {
					case 1:
						sis.addArrenda(0);
						break;
					case 2:
						sis.addBarco(0);
						break;
					case 3:
						sis.addCamera(0);
						break;
					case 4:
						sis.addCompanhia(0);
						break;
					case 5:
						sis.addFuncionario(0);
						break;
					case 6:
						sis.addIncidente(0);
						break;
					case 7:
						sis.addLocal(0);
						break;
					case 8:
						sis.listArrendas();
						break;
					case 9:
						sis.listBarcos();
						break;
					case 10:
						sis.listCameras();
						break;
					case 11:
						sis.listCompanhias();
						break;
					case 12:
						sis.listFuncionarios();
						break;
					case 13:
						sis.listIncidentes();
						break;
					case 14:
						sis.listLocais();
						break;
					case 15:
						sis.alterArrenda();
						break;
					case 16:
						sis.alterBarco();
						break;
					case 17:
						sis.alterCamera();
						break;
					case 18:
						sis.alterCompanhia();
						break;
					case 19:
						sis.alterFuncionario();
						break;
					case 20:
						sis.alterIncidente();
						break;
					case 21:
						sis.alterLocal();
						break;
					case 22:
						sis.listBarcosAtracados();
						break;
					case 23:
						sis.listBarcosCCapitaes();
						break;
					case 24:
						sis.addCapitaoBarco();
						break;
					case 25:
						sis.listHistoricoCapitao();
						break;
					case 26:
						sis.listBarcosNoLocal();
						break;
				}
			}
		} catch(Exception e) {
			System.err.println("Erro");
		}
	}
}
