
public class Aquario extends Viveiro{
	private float altura, temperatura;
	
	public Aquario() {
		super();
	}
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float calculaEspaco() {
		return super.comprimento * super.largura * this.altura;
	}
}
