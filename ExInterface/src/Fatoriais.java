public class Fatoriais extends Gerador{

	public Fatoriais() {
		super();
	}

	public void gerar(int quantidade) {
		int n = 1;
		for (int i=1;i<quantidade+1;i++) {
			n *= i;
			super.sequencia.add(n);
		}
	}
}