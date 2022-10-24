package negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dados.Contato;

public class ListaTelefonica {
	private List<Contato> listaTelefonica = new ArrayList<>();

	public ListaTelefonica(List<Contato> listaTelefonica) {
		super();
		this.listaTelefonica = listaTelefonica;
	}
	
	public ListaTelefonica() {
		
	}
	
	public void AdicionarContato(Contato contato) {
		listaTelefonica.add(contato);
	}
	
	public void RemoverContato(Contato contato) {
		listaTelefonica.remove(contato);
	}
	
	public List<Contato> buscarContatos(char letra){
		return null;
	}
	
	public Map<Character, List<Contato>> listarContatos(){
		return null;
	}
}
