import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaTelefonica {
	private List<Contato> contatos = new ArrayList<Contato>();
	public void adicionarContato(Contato contato) {
		this.contatos.add(contato);
	}
	
	public void removerContato(Contato contato) {
		this.contatos.remove(contato);
	}
	
	public List<Contato> buscarContatos(char letra){
		List<Contato> foundContacts = new ArrayList<Contato>();
		for (int i=0;i<this.contatos.size();i++) {
			if (this.contatos.get(i).getNome().charAt(0) == letra) {
				foundContacts.add(this.contatos.get(i));
			}
		}
		return foundContacts;
	}
	
	public Map<Character, List<Contato>> buscarContatos() {
		Map<Character, List<Contato>> mapa = new HashMap<Character, List<Contato>>();
		for(char c='A';c <= 'Z';c++) {
			mapa.put(c, buscarContatos(c));
		}
		return mapa;
	}
}
