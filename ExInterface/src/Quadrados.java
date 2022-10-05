public class Quadrados extends Gerador{

	public Quadrados() {
		super();
	}

	public void gerar(int quantidade) {
		for (int i=0;i<quantidade;i++) {
			super.sequencia.add(i*i);
		}
	}
}