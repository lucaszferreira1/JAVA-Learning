public class NumeroPrimos extends Gerador{

	public NumeroPrimos() {
		super();
	}

	public void gerar(int quantidade) {
		int contNs = 0;
		int cont = 0;
		while(contNs!=quantidade) {
			if (isPrimo(cont)) {
				super.sequencia.add(cont);
				contNs++;
			}
			cont++;
		}
	}
	
	public boolean isPrimo(int n) {
		for (int i=2;i<n;i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}