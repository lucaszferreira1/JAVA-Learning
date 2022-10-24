package persistencia;

import java.util.List;

import dados.Contato;

public class ArquivoContatoDAO {
	private String caminho;
	
	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	private String toCSV(Contato c) {
		return null;
	}
	
	private Contato fromCSV(String s) {
		return null;
	}
	
	public List<Contato> leContatos(){
		return null;
	}
	
	public void salvaContatos(List<Contato> contatos) {
		
	}
}
