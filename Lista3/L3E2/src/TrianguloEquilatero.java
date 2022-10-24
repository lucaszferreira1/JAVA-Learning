public class TrianguloEquilatero extends FormaGeometrica {
	
	public TrianguloEquilatero(int lado) {
		super.medida1 = lado;
	}

	public int getLado() {
		return super.medida1;
	}

	public void setLado(int lado) {
		super.medida1 = lado;
	}

	@Override
	public int calculaArea() {
		return (int) ((Math.sqrt(3) / 4) * (super.medida1 * super.medida1));
	}

	@Override
	public int calculaPerimetro() {
		return super.medida1 * 3;
	}
	
	@Override
	public String toString() {
		return "Triângulo Equilátero [Lado=" + medida1 + ", Área=" + calculaArea() + ", Perímetro=" + calculaPerimetro() + "]";
	}
}
