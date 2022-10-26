package persistencia;

import java.util.LinkedList;
import java.util.List;

import dados.Contato;

public class ArquivoContatoDAO {
	private String caminho = "files/contatosDAO.csv";
	private static EditorTexto arq = new EditorTexto();
	
	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	private String toCSV(Contato contato) {
		String c = "";
		c += contato.getNome() + ", ";
		c += contato.getTelefone();
		
		return c;
	}
	
	private Contato fromCSV(String s) {
		String[] atributos = s.split(",");
		Contato contato = new Contato();
		contato.setNome(atributos[0]);
		contato.setTelefone(Integer.parseInt(atributos[1]));
		return contato;
	}
	
	public List<Contato> leContatos(){
		return stringToListaContato(arq.leTexto(caminho));
	}
	
	public List<Contato> leContatosChar(char c){
		List<Contato> contatos = new LinkedList<>();
		for (Contato contato : leContatos()) {
			if (contato.getNome().charAt(0) == c) {
				contatos.add(contato);
			}
		}
		return contatos;
	}
	
	public void salvaContatos(List<Contato> contatos) {
		arq.gravaTexto(caminho, listaContatoToString(contatos));
	}
	
	public void salvaContatoArquivo(Contato contato) {
		arq.gravaTexto(caminho, toCSV(contato));
	}
	
	private List<Contato> stringToListaContato(List<String> arquivo){
		List<Contato> contatos = new LinkedList<Contato>();
		for (String linha : arquivo) {
			contatos.add(fromCSV(linha));
		}
		return contatos;
	}
	
	private List<String> listaContatoToString(List<Contato> contatos){
		List<String> arquivo = new LinkedList<String>();
		for (Contato contato : contatos) {
			arquivo.add(toCSV(contato));
		}
		return arquivo;
	}
}
