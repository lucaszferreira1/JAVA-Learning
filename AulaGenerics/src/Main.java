import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

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
		//Trocar o filepath para o da máquina sendo usada;
		String filePath = "C:\\\\Users\\\\12046333985\\\\eclipse-workspace\\\\ExCollections\\\\src\\\\nomes.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;
			while ((line = br.readLine()) != null) {
				int randomInt = ThreadLocalRandom.current().nextInt(0, 1000000000);
				listaContatos.add(new Contato(line, randomInt));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		lista.setContatos(listaContatos);
		/* Contato c1 = new Contato("Jão", 11231235);
		Contato c2 = new Contato("José", 198426187);
		lista.adicionarContato(c1);
		lista.adicionarContato(c2); */
		exibirContatos();
	}
}
