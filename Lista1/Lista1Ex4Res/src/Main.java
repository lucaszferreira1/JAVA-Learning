
public class Main {
	public static Sorteador sorteador = new Sorteador();
	
	public static void main(String args[]) {
		Pessoa pes_1 = new Pessoa("Carlos");
		Pessoa pes_2 = new Pessoa("Marcos");
		Pessoa pes_3 = new Pessoa("Marcelo");
		sorteador.setPessoa(pes_1);
		sorteador.setPessoa(pes_3);
		sorteador.setPessoa(pes_2);
		System.out.println(sorteador.sortearProximo().getNome());
	}
}
