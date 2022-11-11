
public class Mod implements IOperacaoInteira{
	@Override
	public int executar(int valor1, int valor2) {
		while(valor1 - valor2 >= 0) {
			valor1 = valor1 - valor2;
		}
		return valor1;
	}
}
