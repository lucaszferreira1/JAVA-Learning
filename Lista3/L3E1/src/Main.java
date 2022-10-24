
public class Main {
	public static void main(String args[]) {
		Cachorro rex = new Cachorro();
		rex.setNome("Rex");
		Gato frajola = new Gato();
		frajola.setNome("Frajola");
		Pato marreco = new Pato();
		marreco.setNome("Marreco");
		System.out.println(rex.emitirSom());
		System.out.println(frajola.emitirSom());
		System.out.println(marreco.emitirSom());
	}
}
