public class Abundantes extends Gerador{
	
	public Abundantes() {
		super();
	}

	public void gerar(int quantidade) {
		int quantAbund = 0;
		int cont=0;
		while(quantAbund!=quantidade) {
			if (isAbundante(cont)) {
				super.sequencia.add(cont);
				quantAbund++;
			}
			cont++;
		}
	}
	
	public boolean isAbundante(int n) {
		int soma = 0;
		for (int i=1;i<n;i++) {
			if ((n % i) == 0) {
				soma += i;
			}
		}
		if (soma>n) {
			return true;
		}else {
			return false;
		}
	}
}
