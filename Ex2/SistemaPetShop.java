import java.util.Scanner;

public class SistemaPetShop {
	public Veterinario[] vets = new Veterinario[50];
	public int numVets;
	
	Scanner scanner = new Scanner(System.in);
	
	public int getNumVets() {
		return numVets;
	}
	
	public Veterinario[] getVets() {
		return vets;
	}

	public void setNumVets(int numVets) {
		this.numVets = numVets;
	}

	public void setVets(Veterinario[] vets) {
		this.vets = vets;
	}
	
	
	
	public void cadVet() {
		System.out.println("Nome do Veterinário: ");
		vets[numVets].nome = scanner.nextLine();
		System.out.println("Salário do Veterinário: ");
		vets[numVets].salario = scanner.nextInt();
		numVets++;
	}
	
	public void showVet() {
		for (int i=0;i<numVets;i++) {
			System.out.println(i + " - " + vets[i].getNome());
		}
	}
	
	public void cadEndVets() {
		Endereco endVet = null;
		showVet();
		System.out.println("Escolha qual veterinário você deseja cadastrar o Endereço: ");
		int escolha = scanner.nextInt();
		System.out.println("Nome da Rua: ");
		endVet.rua = scanner.nextLine();
		System.out.println("Número da Casa: ");
		endVet.num = scanner.nextInt();
		System.out.println("Bairro: ");
		endVet.bairro = scanner.nextLine();
		System.out.println("Cidade: ");
		endVet.cidade = scanner.nextLine();
		System.out.println("Estado: ");
		endVet.estado = scanner.nextLine();
		System.out.println("CEP: ");
		endVet.cep = scanner.nextInt();
		vets[escolha].setEndereco(endVet);
	}
	
	public void cadAnimal() {
		Animal animal = null;
		showVet();
		System.out.println("Escolha qual veterinário você deseja cadastrar o Animal: ");
		int escolha = scanner.nextInt();
		System.out.println("Nome: ");
		animal.nome = scanner.nextLine();
		System.out.println("Espécie: ");
		animal.especie = scanner.nextLine();
		System.out.println("Descrição: ");
		animal.desc = scanner.nextLine();
		vets[escolha].setAnimal(animal);
	}
	
	public void showAnimais() {
		showVet();
		System.out.println("Escolha qual veterinário você deseja cadastrar o Animal: ");
		int escolha = scanner.nextInt();
		for (int i=0;i<vets[escolha].quantAnimais;i++) {
			System.out.println(i + " - " + vets[escolha].getAnimais()[i].nome);
		}
	}
	
	private Animal showAllAnimais(){
		int contPets = 0;
		for (int i=0;i<numVets;i++) {
			for (int j=0;j<vets[i].getQuantAnimais();j++) {
				System.out.println(vets[i].getAnimais()[j].getNome());
				contPets++;
			}
		}
		System.out.println();
		int escolha = scanner.nextInt();
		contPets = 0;
		
		for (int i=0;i<numVets;i++) {
			for (int j=0;j<vets[i].getQuantAnimais();j++) {
				if (contPets == escolha) {
					return (vets[i].getAnimais()[j]);
				}
				contPets++;
			}
		}
		return null;
	}
	
	public void cadDono() {
		Dono dono = null;
		
		Animal animal = showAllAnimais();
		
		System.out.println("Escolha qual animal você deseja cadastrar o Dono: ");
		int escolhaPet = scanner.nextInt();
		System.out.println("Nome: ");
		dono.nome = scanner.nextLine();
		System.out.println("Espécie: ");
		dono.cpf = scanner.nextInt();
		animal.setDono(dono);
	}
	
	public void cadEndDono() {
		
	}
}
