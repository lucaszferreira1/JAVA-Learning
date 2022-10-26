package negocio;

import java.util.List;
import java.util.Map;

import dados.Contato;
import persistencia.ContatoDAO;

public class ListaTelefonica {
	private ContatoDAO contatos = new ContatoDAO();

	public ListaTelefonica(ContatoDAO contatos) {
		super();
		this.contatos = contatos;
	}
	
	public ListaTelefonica() {
		
	}
	
	public void AdicionarContato(Contato contato) {
		contatos.insert(contato);
	}
	
	public void RemoverContato(Contato contato) {
		contatos.delete(contato);
	}
	
	public List<Contato> buscarContatos(char letra){
		return this.contatos.getAll().get(letra);
	}
	
	public Map<Character, List<Contato>> listarContatos(){
		return this.contatos.getAll();
	}
}
