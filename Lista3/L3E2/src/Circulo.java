
public class Circulo extends FormaGeometrica {
	
	public Circulo(int raio) {
		super.medida1 = raio;
	}
	
	public int getRaio() {
		return super.medida1;
	}

	public void setRaio(int raio) {
		super.medida1 = raio;
	}

	@Override
	public int calculaArea() {
		return (int) (Math.PI * super.medida1 * super.medida1);
	}

	@Override
	public int calculaPerimetro() {
		return (int) (Math.PI * super.medida1 * 2);
	}
	
	@Override
	public String toString() {
		return "Círculo [Raio=" + medida1 + ", Área=" + calculaArea() + ", Perímetro=" + calculaPerimetro() + "]";
	}

}
