package persistencia;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class EditorTexto {
	public List<String> leTexto(String caminho) {
		return null;
	}
	
	public void gravaTexto(String caminho, List<String> dados) {
		FileWriter arq;
		try {
			arq = new FileWriter(caminho);
			for (int i = 0; i< dados.size(); i++) {
				arq.write(dados.get(i) + "\n");
			}
			arq.close();
		}catch(Exception e) {
			System.err.println("Erro ao manipular o arquivo");
			System.exit(0);
		}
	}
	
	public void gravaTexto(String caminho, String linha) {
		
	}
}
