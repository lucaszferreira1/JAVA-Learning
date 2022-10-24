
public class Main {
	public static void main(String args[]) {
		TrianguloEquilatero tri1 = new TrianguloEquilatero(3);
		TrianguloEquilatero tri2 = new TrianguloEquilatero(8);
		Losango los1 = new Losango(6, 2);
		Losango los2 = new Losango(3, 4);
		Circulo cir1 = new Circulo(5);
		Circulo cir2 = new Circulo(10);
		
		System.out.println(tri1.toString());
		System.out.println(tri2.toString());
		System.out.println();
		System.out.println(los1.toString());
		System.out.println(los2.toString());
		System.out.println();
		System.out.println(cir1.toString());
		System.out.println(cir2.toString());
	}
}
