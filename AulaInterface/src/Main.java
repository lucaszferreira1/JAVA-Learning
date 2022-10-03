
public class Main {
	public static CalculadoraInteiros calcI = new CalculadoraInteiros();
	public static CalculadoraComplexos calcC = new CalculadoraComplexos();
	public static void main(String args[]) {
		Complexo c1 = new Complexo(1, 2);
		Complexo c2 = new Complexo(5, 6);
		int i1 = 10;
		int i2 = 12;
		
		
		System.out.println(calcI.soma(i1, i2));
		System.out.println(calcC.soma(c1, c2));
	}
}
