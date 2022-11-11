
public class Main {
	public static void main(String args[]) {
		Multiplicacao a = new Multiplicacao();
		MDC b = new MDC();
		Mod c = new Mod();
		
		System.out.println(a.executar(2, 6));
		System.out.println(b.executar(3, 999));
		System.out.println(c.executar(6, 3));
	}
}
