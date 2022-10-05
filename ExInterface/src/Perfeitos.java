public class Perfeitos extends Gerador{

	public Perfeitos() {
		super();
	}

	public void gerar(int quantidade) {
		int quantPerf = 0;
		int cont=1;
		while(quantPerf!=quantidade) {
			if (isPerfeito(cont)) {
				super.sequencia.add(cont);
				quantPerf++;
			}
			cont++;
		}
	}
	
	public boolean isPerfeito(int n) {
		int soma = 0;
		for (int i=1;i<n;i++) {
			if ((n % i) == 0) {
				soma += i;
				
			}
		}
		if (soma==n) {
			return true;
		}else {
			return false;
		}
	}
}