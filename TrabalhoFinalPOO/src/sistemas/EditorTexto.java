package sistemas;

import java.util.LinkedList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class EditorTexto {
	public List<String> leTexto(String caminho) {
		List<String> dados = new LinkedList<String>();
		FileReader arq;
		BufferedReader lerArq;
		try {
			arq = new FileReader(caminho);
			lerArq = new BufferedReader(arq);
			String s = lerArq.readLine();
			while(s != null) {
				dados.add(s);
				s = lerArq.readLine();
			}
			arq.close();
		} catch (Exception e) {
			System.err.println("Erro ao manipular o arquivo, Função de Leitura");
			System.exit(0);
		}
		return dados;
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
			System.err.println("Erro ao manipular o arquivo, Função de Gravar Texto");
			System.exit(0);
		}
	}
	
	public void gravaTexto(String caminho, String linha) {
		FileWriter arq;
		System.out.println(linha);
		try {
			arq = new FileWriter(caminho, true);
			arq.write("\n"+linha);
			arq.close();
		}catch(Exception e) {
			System.err.println("Erro ao manipular o arquivo, Função de Gravar Linha");
			System.exit(0);
		}
	}
}