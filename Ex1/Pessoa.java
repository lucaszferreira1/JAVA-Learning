public class Pessoa {
	public String nome;
	public int idade;
	public double altura;
	public double massa;
	
	public Pessoa() {
		
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