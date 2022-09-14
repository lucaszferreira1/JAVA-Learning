
public class Zoologico {
	private Viveiro viveiros[] = new Viveiro[64];
	private Animal animais[] = new Animal[64];
	private int nViveiros = 0;
	private int nAnimais = 0;
	
	public int getnViveiros() {
		return nViveiros;
	}

	public void setnViveiros(int nViveiros) {
		this.nViveiros = nViveiros;
	}

	public int getnAnimais() {
		return nAnimais;
	}

	public void setnAnimais(int nAnimais) {
		this.nAnimais = nAnimais;
	}

	public void cadastrarViveiro(Viveiro viveiro) {
		this.viveiros[this.nViveiros] = viveiro;
		nViveiros++;
	}
	
	public void cadastrarAnimais(Animal animal) {
		this.animais[this.nAnimais] = animal;
		nAnimais++;
	}
	
	public void alocarAnimal(Animal animal, Viveiro viveiro) {
		if (viveiro.getEspacoDisponivel() > (animal.calculaEspacoOcupado() * 0.7)) {
			if (viveiro instanceof Aquario) {
				if (animal instanceof Peixe && (((Peixe) animal).getTemperaturaIdeal() == ((Aquario) viveiro).getTemperatura())) {
					viveiro.adicionarAnimal(animal);
				}
			}else {
				viveiro.adicionarAnimal(animal);
			}
		}
	}
	
	public Aquario[] getSoAquarios() {
		int i;
		Aquario aquarios[] = new Aquario[64];
		int nAquarios = 0;
		for(i = 0;i < nViveiros;i++) {
			if (this.viveiros[i] instanceof Aquario) {
				aquarios[nAquarios] = (Aquario) this.viveiros[i];
				nAquarios++;
			}
		}
		return aquarios;
	}
	
	public Viveiro[] getSoViveiros() {
		return this.viveiros;
	}
	
	public Animal[] getAnimaisInViveiro(Viveiro viveiro) {
		return viveiro.getAnimais();
	}
	
	public Animal[] getSoAnimais() {
		return this.animais;
	}
	
	public int getNAquarios() {
		int i;
		int nAquarios = 0;
		for(i = 0;i < nViveiros;i++) {
			if (this.viveiros[i] instanceof Aquario) {
				nAquarios++;
			}
		}
		return nAquarios;
	}
}
