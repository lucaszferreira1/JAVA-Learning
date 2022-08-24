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

	public Pessoa getPessoa(int pos) {
		return pessoas[pos];
	}
	
	public Pessoa[] getPessoas() {
		return pessoas;
	}
	
	public void setPessoa(Pessoa p) {
		if (numPessoas < 5) {
			pessoas[this.numPessoas]= p; 
			this.numPessoas++;
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