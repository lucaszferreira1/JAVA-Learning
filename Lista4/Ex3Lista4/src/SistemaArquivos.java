import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaArquivos {
	private Map<String, List<Arquivo>> diretorios = new HashMap<String, List<Arquivo>>();
	
	public void criarDocumento(String nome, String diretorio, String texto) throws NomeInvalidoException {
		if (this.diretorios.containsKey(diretorio)) {
			this.diretorios.get(diretorio).add(new Documento(nome, texto));
		}else {
			List<Arquivo> tempList = new ArrayList<>();
			tempList.add(new Documento(nome, texto));
			this.diretorios.put(diretorio, tempList);
		}
	}
	
	public void criarMusica(String nome, String diretorio, int duracao) throws NomeInvalidoException {
		if (this.diretorios.containsKey(diretorio)) {
			this.diretorios.get(diretorio).add(new Musica(nome, duracao));
		}else {
			List<Arquivo> tempList = new ArrayList<>();
			tempList.add(new Musica(nome, duracao));
			this.diretorios.put(diretorio, tempList);
		}
	}
	
	public void criarVideo(String nome, String diretorio, Qualidade qualidade) throws NomeInvalidoException {
		if (this.diretorios.containsKey(diretorio)) {
			this.diretorios.get(diretorio).add(new Video(nome, qualidade));
		}else {
			List<Arquivo> tempList = new ArrayList<>();
			tempList.add(new Video(nome, qualidade));
			this.diretorios.put(diretorio, tempList);
		}
	}

	@Override
	public String toString() {
		String msg = new String();
		for (String s : this.diretorios.keySet()) {
			msg += s + ":\n";
			for (Arquivo a : this.diretorios.get(s)) {
				msg += "	" + a.toString() + "\n\n";
			}
		}
		return msg;
	}
}
