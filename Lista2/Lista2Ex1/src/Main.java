import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static Programa programa = new Programa();
	public static Scanner scan = new Scanner(System.in);
	
	public static void addPeople() {
		System.out.println("");
		String nome = scan.nextLine();
		System.out.println("");
		int idade = scan.nextInt();
		System.out.println("");
		int cpf = scan.nextInt();
		scan.nextLine();
		System.out.println("");
		String cidade = scan.nextLine();
		programa.adicionarPessoa(new Pessoa(nome, cidade, idade, cpf));
	}
	
	public static void showPessoas() {
		Map<String, List<Pessoa>> mapa = programa.getPessoas();
		mapa.keySet().forEach(key ->{
			System.out.println(key);
			mapa.get(key).forEach(value ->{
				System.out.println(value.toString());
			});
		});
	}
	
	public static void main(String args[]) {
		programa.adicionarPessoa(new Pessoa("Marcus", "Joinville", 11, 123123123));
		programa.adicionarPessoa(new Pessoa("Carlos", "Joinville", 12, 123123123));
		programa.adicionarPessoa(new Pessoa("Carlito", "Joinville", 17, 123123123));
		programa.adicionarPessoa(new Pessoa("Carlão", "Joinville", 18, 123123123));
		programa.adicionarPessoa(new Pessoa("Carla", "Joinville", 19, 123123123));
		showPessoas();
	}
}
