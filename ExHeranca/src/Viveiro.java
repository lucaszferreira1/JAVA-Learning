import java.util.Arrays;

public class Viveiro {
	protected String nome;
	protected float comprimento, largura;
	protected Animal animais[] = new Animal[64];
	protected int nAnimais = 0;
	
	public Viveiro() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public Animal[] getAnimais() {
		return animais;
	}

	public void setAnimais(Animal[] animais) {
		this.animais = animais;
	}

	public int getnAnimais() {
		return nAnimais;
	}

	public void setnAnimais(int nAnimais) {
		this.nAnimais = nAnimais;
	}

	public float calculaEspaco() {
		return comprimento * largura;
	}
	
	public float getEspacoDisponivel() {
		int i;
		float espacoGasto = 0;
		for (i = 0;i < this.nAnimais;i++) {
			espacoGasto += animais[i].calculaEspacoOcupado();
		}
		
		return calculaEspaco() - espacoGasto;
	}
	
	public boolean adicionarAnimal(Animal animal) {
		if (animal != null) {
			this.animais[nAnimais] = animal;
			this.nAnimais++;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Nome:" + nome + ", Comprimento:" + comprimento + ", Largura:" + largura + ", Número de Animais=" + nAnimais;
	}
}
