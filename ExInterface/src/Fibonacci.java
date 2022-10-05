public class Fibonacci extends Gerador{

	public Fibonacci() {
		super();
	}

	public void gerar(int quantidade) {
		int p = 1;
		int q = 1;
		int r = 1;
		super.sequencia.add(0);
		if (quantidade > 1) {
			sequencia.add(1);
		}
		for (int i=0;i<quantidade-2;i++) {
			super.sequencia.add(p);
			q = p;
			p = q + r;
			r = q;
		}
	}
}