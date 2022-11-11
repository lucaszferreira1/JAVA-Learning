
public class Multiplicacao extends Soma{

	@Override
	public int executar(int valor1, int valor2) {
		int a = valor1;
		for (int i=1;i<valor2;i++) {
			valor1 = super.executar(valor1, a);
		}
		return valor1;
	}
	
}
