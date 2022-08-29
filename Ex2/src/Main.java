import java.util.Scanner;

public class Main {
	static SistemaPetShop sistema = new SistemaPetShop();
	static Veterinario vet1 = new Veterinario();
	static Endereco endVet1 = new Endereco();
	static Animal ani1 = new Animal();
	static Scanner scanner = new Scanner(System.in);
	
	static void cadVet() {
		Veterinario vet = new Veterinario();
		System.out.println("Nome do Veterinário: ");
		vet.nome = scanner.nextLine();
		System.out.println("Salário do Veterinário: ");
		vet.salario = scanner.nextInt();
		sistema.vets[sistema.numVets] = vet;
		sistema.numVets++;
	}
	
	static void showVet() {
		for (int i=0;i<sistema.numVets;i++) {
			System.out.println(i + " - " + sistema.vets[i].getNome());
		}
	}
	
	static Endereco cadEnd() {
		Endereco end = new Endereco();
		System.out.println("Nome da Rua: ");
		end.rua = scanner.nextLine();
		System.out.println("Bairro: ");
		end.bairro = scanner.nextLine();
		System.out.println("Cidade: ");
		end.cidade = scanner.nextLine();
		System.out.println("Estado: ");
		end.estado = scanner.nextLine();
		System.out.println("Número da Casa: ");
		end.num = scanner.nextInt();
		System.out.println("CEP: ");
		end.cep = scanner.nextInt();
		return end;
	}
	
	static void cadEndVet() {
		Endereco endVet = new Endereco();
		showVet();
		System.out.println("Escolha qual veterinário você deseja cadastrar o Endereço: ");
		int escolha = scanner.nextInt();
		scanner.nextLine();
		endVet = cadEnd();
		sistema.vets[escolha].setEndereco(endVet);
	}
	
	static void cadAnimal() {
		Animal animal = new Animal();
		int escolha;
		showVet();
		System.out.println("Escolha qual veterinário você deseja cadastrar o Animal: ");
		escolha = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Nome: ");
		animal.nome = scanner.nextLine();
		System.out.println("Espécie: ");
		animal.especie = scanner.nextLine();
		System.out.println("Descrição: ");
		animal.desc = scanner.nextLine();
		sistema.vets[escolha].setAnimal(animal);
	}
	
	static void showAnimais() {
		int contPets = 0;
		for (int i=0;i<sistema.numVets;i++) {
			for (int j=0;j<sistema.vets[i].getQuantAnimais();j++) {
				System.out.println(contPets + " - " + sistema.vets[i].getAnimais()[j].getNome());
				contPets++;
			}
		}
	}
	
	static Animal chooseAllAnimais(){
		System.out.println("Escolha o Pet: ");
		showAnimais();
		System.out.println();
		int escolha = scanner.nextInt();
		scanner.nextLine();
		int contPets = 0;
		
		for (int i=0;i<sistema.numVets;i++) {
			for (int j=0;j<sistema.vets[i].getQuantAnimais();j++) {
				if (contPets == escolha) {
					return (sistema.vets[i].getAnimais()[j]);
				}
				contPets++;
			}
		}
		return null;
	}
	
	static void cadDono() {
		Dono dono = new Dono();
		Animal animal = chooseAllAnimais();
		System.out.println("Nome: ");
		dono.nome = scanner.nextLine();
		System.out.println("CPF: ");
		dono.cpf = scanner.nextInt();
		scanner.nextLine();
		animal.setDono(dono);
	}
	
	static void cadEndDono() {
		Animal animal = chooseAllAnimais();
		System.out.println("Nome do Dono: " + animal.dono.getNome());
		System.out.println("CPF: " + animal.dono.getCpf());
		animal.dono.setEndereco(cadEnd());
	}
	
	static void menu() {
		int escolha;
		System.out.println("BEM VINDO(A) AO SISTEMA DE CLÍNICA VETERINÁRIA");
		System.out.println("Escolha o número de uma das opções abaixo:");
		System.out.println("1 - Cadastrar Veterinário");
		System.out.println("2 - Mostrar Todos os Veterinários");
		System.out.println("3 - Cadastrar o Endereço de um Veterinário");
		System.out.println("4 - Cadastrar um animal");
		System.out.println("5 - Mostrar Todos os Animais");
		System.out.println("6 - Cadastrar o Dono de um Animal");
		System.out.println("7 - Cadastrar o Endereço de um Dono");
		escolha = scanner.nextInt();
		scanner.nextLine();
		
		switch(escolha) {
			case 1:
				cadVet();
				break;
			case 2:
				showVet();
				break;
			case 3:
				cadEndVet();
				break;
			case 4:
				cadAnimal();
				break;
			case 5:
				showAnimais();
				break;
			case 6:
				cadDono();
				break;
			case 7:
				cadEndDono();
				break;
		}
	}
	
	
	static void setParams() {
		endVet1.setRua("Rua Pirambolas");
		endVet1.setNum(123);
		endVet1.setCep(12345669);
		endVet1.setBairro("Saguaçu");
		endVet1.setCidade("Araquari");
		endVet1.setEstado("Santa Jucelina");
		
		vet1.setNome("Marcos");
		vet1.setEndereco(endVet1);
		vet1.setAnimal(null);
		vet1.setQuantAnimais(0);
		vet1.setSalario(5400.5);
		
		ani1.setNome("El Chupacabra");
		ani1.setEspecie("Chupacabra");
		ani1.setDesc("El capiroto en la terra");
		
		vet1.setAnimal(ani1);
		sistema.setVet(vet1);
	}
	
	public static void main(String args[]) {
		setParams();
		while (true)
			menu();
	}
}
