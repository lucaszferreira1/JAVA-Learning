package persistencia;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dados.Contato;

public class ContatoDAO {
	
	private ArquivoContatoDAO arquivoContatoDAO = new ArquivoContatoDAO();
	
	public void insert(Contato contato) {
		arquivoContatoDAO.salvaContatoArquivo(contato);
	}
	
	public void delete(Contato contato) {
		List<Contato> contatos = arquivoContatoDAO.leContatos();
		contatos.remove(contato);
		arquivoContatoDAO.salvaContatos(contatos);
	}
	
	public Map<Character, List<Contato>> getAll(){
		char c;
		Map<Character, List<Contato>> lista = new HashMap<>();
		for(c = 'A'; c <= 'Z'; ++c) {
			lista.put(c, arquivoContatoDAO.leContatosChar(c));
		}
		return lista;
	}
}
