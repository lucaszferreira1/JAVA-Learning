
public class Main {
	public static void main(String args[]) {
		TrianguloEquilatero tri = new TrianguloEquilatero(3);
		Losango los = new Losango(3, 4);
		Circulo cir = new Circulo(5);
		
		System.out.println(tri.calculaArea());
		System.out.println(tri.calculaPerimetro());
		System.out.println();
		System.out.println(los.calculaArea());
		System.out.println(los.calculaPerimetro());
		System.out.println();
		System.out.println(cir.calculaArea());
		System.out.println(cir.calculaPerimetro());
	}
}
