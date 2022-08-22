package ex1;

public class Main {
	public static Grupo teste = new Grupo(0, null);
	
	public static Pessoa p1 = new Pessoa("José", 19, 1.87, 69.7);
	public static Pessoa p2 = new Pessoa("José2", 15, 1.56, 60.6);
	public static Pessoa p3 = new Pessoa("José3", 13, 1.13, 78.1);
	public static Pessoa p4 = new Pessoa("José4", 17, 1.77, 55.3);
	public static Pessoa p5 = new Pessoa("José5", 16, 1.62, 100.2);
	
	public static void main(String args[]) {
		teste.setPessoas([p1, p2, p3, p4, p5]);
	}
}









package ex1;

public class Pessoa {
	public String nome;
	public int idade;
	public double altura;
	public double massa;
	
	public Pessoa(String nome, int idade, double altura, double massa) {
		
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getIdade() {
		return nome;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getMassa() {
		return massa;
	}

	public void setMassa(double massa) {
		this.massa = massa;
	}
	
	public double CalcularIMC() {
		return (massa/(altura*altura));
	}
}









package ex1;

public class Grupo {
	public int numPessoas = 0;
	public Pessoa[] pessoas = new Pessoa [5];

	public Grupo(int numPessoas, Pessoa[] pessoas) {
		
	}

	public int getNumPessoas() {
		return numPessoas;
	}

	public void setNumPessoas(int numPessoas) {
		this.numPessoas = numPessoas;
	}

	public Pessoa[] getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoa[] pessoas) {
		if (numPessoas < 5) {
			this.pessoas = pessoas;
			numPessoas++;
		}
	}
	
	public void orderByIMC() {
		for (int i=0;i<5;i++) {
			for (int j=0;j<4;j++) {
				if (pessoas[j].CalcularIMC() > pessoas[j+1].CalcularIMC()) {
					Pessoa aux = pessoas[j];
					pessoas[j] = pessoas[j+1];
					pessoas[j+1] = aux;
				}
			}
		}
	}
}
