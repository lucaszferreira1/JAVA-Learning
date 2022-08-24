
public class Veterinario {
	public String nome;
	public double salario;
	public Animal[] animais = new Animal[25];
	public Endereco endereco;
	public int quantAnimais;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Animal[] getAnimais() {
		return animais;
	}

	public void setAnimal(Animal animal) {
		this.animais[quantAnimais] = animal;
		quantAnimais++;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getQuantAnimais() {
		return quantAnimais;
	}

	public void setQuantAnimais(int quantAnimais) {
		this.quantAnimais = quantAnimais;
	}
}
