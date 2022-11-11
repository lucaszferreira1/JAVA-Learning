
public class MDC implements IOperacaoInteira{

	@Override
	public int executar(int valor1, int valor2) {
		int nSeq = 0;
		int maior = 1;
		if (valor1 > valor2) {
			nSeq = valor1;
		}else {
			nSeq = valor2;
		}
		for (int i=2;i<=nSeq;i++) {
			if (new Mod().executar(valor1, i) == 0 && new Mod().executar(valor2, i) == 0 && (i > maior)) {
				maior = i;
			}
		}
		return maior;
	}
	
	private boolean isInt(double val) {
		double tol = 1E-5;
		return Math.abs(Math.floor(val) - val) < tol;
	}
}
