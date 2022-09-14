
public class Peixe extends Animal{

	private float temperaturaIdeal;
	
	public Peixe() {
		super();
	}
	
	public float getTemperaturaIdeal() {
		return temperaturaIdeal;
	}

	public void setTemperaturaIdeal(float temperaturaIdeal) {
		this.temperaturaIdeal = temperaturaIdeal;
	}

	public float calculaEspacoOcupado() {
		return super.largura * super.comprimento * super.altura;
	}
}
