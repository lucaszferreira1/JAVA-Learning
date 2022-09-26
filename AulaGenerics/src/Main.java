import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
	public static ListaTelefonica lista = new ListaTelefonica();
	
	public static void exibirContatos() {
		Map<Character, List<Contato>> mapa = lista.buscarContatos();
		for (char c = 'A';c <= 'Z';c++) {
			System.out.println(c + ":");
			for (int i=0;i < mapa.get(c).size();i++) {
				System.out.println(mapa.get(c).get(i).toString());
			}
		}
	}
	
	public static void main(String args[]) {
		List<Contato> listaContatos = new ArrayList<Contato>();
		
			
		
		
		Contato c1 = new Contato("Jão", 11231235);
		Contato c2 = new Contato("José", 198426187);
		lista.adicionarContato(c1);
		lista.adicionarContato(c2);
		exibirContatos();
	}
}
