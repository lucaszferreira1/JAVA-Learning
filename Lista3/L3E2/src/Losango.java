
public class Losango extends FormaGeometrica {
	
	public Losango(int D, int d) {
		super.medida1 = D;
		super.medida2 = d;
	}
	
	public int getD() {
		return super.medida1;
	}

	public void setD(int d) {
		super.medida1 = d;
	}

	public int getd() {
		return super.medida2;
	}

	public void setd(int d) {
		super.medida2 = d;
	}

	@Override
	public int calculaArea() {
		return (super.medida1 * super.medida2) / 2;
	}

	@Override
	public int calculaPerimetro() {
		return (int) (4 * (Math.sqrt(((super.medida1 * super.medida1) / 4) + ((super.medida2 * super.medida2) / 4))));
	}

}
