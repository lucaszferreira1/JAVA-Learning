import java.util.Scanner;

public class Main {
	public static Zoologico zoologico = new Zoologico();
	public static Scanner scan = new Scanner(System.in);
	public static void cadViv() {
		Viveiro viveiro = new Viveiro();
		System.out.println("Nome:");
		String nome = scan.nextLine();
		viveiro.setNome(nome);

		System.out.println("Comprimento:");
		float comprimento = scan.nextFloat();
		viveiro.setComprimento(comprimento);

		System.out.println("Largura:");
		float largura = scan.nextFloat();
		viveiro.setLargura(largura);
		
		zoologico.cadastrarViveiro(viveiro);
	}
	
	public static void cadAni() {
		Animal animal = new Animal();
		
		System.out.println("Nome:");
		String nome = scan.nextLine();
		animal.setNome(nome);
		
		System.out.println("Cor:");
		String cor = scan.nextLine();
		animal.setCor(cor);

		System.out.println("Espécie:");
		String especie = scan.nextLine();
		animal.setEspecie(especie);

		System.out.println("Idade:");
		int idade = scan.nextInt();
		scan.nextLine();
		animal.setIdade(idade);

		System.out.println("Comprimento:");
		float comprimento = scan.nextFloat();
		animal.setComprimento(comprimento);

		System.out.println("Largura:");
		float largura = scan.nextFloat();
		animal.setLargura(largura);

		System.out.println("Altura:");
		float altura = scan.nextFloat();
		animal.setAltura(altura);

		zoologico.cadastrarAnimais(animal);
	}
	
	public static void cadAniViv() {
		int escolha;
		int i;
		
		System.out.println("Escolha o viveiro: ");
		Viveiro viveiro = new Viveiro();
		showViv(false);
		escolha = scan.nextInt();
		scan.nextLine();
		for (i = 0;i<zoologico.getnViveiros();i++) {
			if (escolha == i) {
				viveiro = zoologico.getSoViveiros()[i];
			}
		}
		
		Animal animal = new Animal();
		showAni();
		escolha = scan.nextInt();
		scan.nextLine();
		for (i = 0;i<zoologico.getnAnimais();i++) {
			if (escolha == i) {
				animal = zoologico.getSoAnimais()[i];
			}
		}
		
		zoologico.alocarAnimal(animal, viveiro);
	}
	
	public static void showAqu() {
		Aquario aquarios[] = zoologico.getSoAquarios();
		int i = 0;
		for (i = 0;i < zoologico.getNAquarios();i++) {
			System.out.println(i + " - " + aquarios[i].toString());
			if (aquarios[i].getnAnimais() > 0) {
				showAni(aquarios[i]);
			}else {
				System.out.println("Aquário Vazio");
			}
		}
	}
	
	public static void showViv(boolean showAnimais) {
		Viveiro viveiros[] = zoologico.getSoViveiros();
		int i = 0;
		for (i = 0;i < zoologico.getnViveiros();i++) {
			System.out.println(i + " - " + viveiros[i].toString());
			if (showAnimais) {
				if (viveiros[i].getnAnimais() > 0) {
					showAni(viveiros[i]);
				}else {
					System.out.println("Viveiro Vazio");
				}
			}
		}
	}
	
	public static void showAni() {
		Animal animais[] = zoologico.getSoAnimais();
		int i;
		for (i = 0;i < zoologico.getnAnimais();i++) {
			System.out.println(i + " - " + animais[i].toString());
		}
	}
	
	public static void showAni(Viveiro viveiro) {
		int i;
		Animal animais[] = viveiro.getAnimais();
		for (i = 0;i < zoologico.getnAnimais();i++) {
			if (animais[i] != null) {
			System.out.println(i + " - " + animais[i].toString());
			}else {
				return;
			}
		}
	}
	
	public static void main(String args[]) {
		Animal jose = new Animal();
		jose.setNome("José");
		jose.setCor("Rosa");
		jose.setEspecie("Joselino");
		jose.setIdade(4);
		jose.setLargura(10);
		jose.setComprimento(10);
		jose.setAltura(10);
		zoologico.cadastrarAnimais(jose);
		
		Peixe teste = new Peixe();
		teste.setNome("Tesete");
		teste.setCor("Salmão");
		teste.setEspecie("Salmão");
		teste.setIdade(2);
		teste.setLargura(01f);
		teste.setComprimento(0.6f);
		teste.setAltura(0.8f);
		teste.setTemperaturaIdeal(5);
		zoologico.cadastrarAnimais(teste);
		
		Viveiro viv1 = new Viveiro();
		viv1.setNome("Viv - 1");
		viv1.setComprimento(30);
		viv1.setLargura(30);
		zoologico.cadastrarViveiro(viv1);
		
		Aquario aqu1 = new Aquario();
		aqu1.setNome("Aqu - 1");
		aqu1.setComprimento(60);
		aqu1.setLargura(60);
		aqu1.setAltura(60);
		aqu1.setTemperatura(5);
		zoologico.cadastrarViveiro(aqu1);

		while(true) {
			System.out.println("Sistema de Zoológicos");
			System.out.println("1 - Cadastrar Viveiro");
			System.out.println("2 - Cadastrar Animal");
			System.out.println("3 - Alocar Animal");
			System.out.println("4 - Mostrar Aquarios");
			System.out.println("5 - Mostrar Viveiros");
			System.out.println("6 - Mostrar Animais");
			int escolha;
			escolha = scan.nextInt();
			scan.nextLine();
			
			switch(escolha) {
			case 1:
				cadViv();
				break;
			
			case 2:
				cadAni();
				break;
	
			case 3:
				cadAniViv();
				break;
			
			case 4:
				showAqu();
				break;
				
			case 5:
				showViv(true);
				break;
				
			case 6:
				showAni();
				break;
			}
		}
	}
}
