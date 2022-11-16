package objetos;

import java.io.File;

import org.apache.tika.metadata.Metadata;

import sistemas.AudioParser;

public class Musica {
	private String nome, filePath, artista;
	private int duracao;

	public Musica() {
	}
	
	public Musica(String nome, String filePath) {
		this.nome = nome;
		this.filePath = filePath;
	}
	
	public void fileToMusica(File f) {
		AudioParser parse = new AudioParser();
		Metadata metadata = parse.getMetadata(f.getPath());
		
		if (metadata.get("title") != null && metadata.get("xmpDM:artist") != null) {
			this.artista = metadata.get("title");
			this.nome = metadata.get("xmpDM:artist");
		}else {
			String s[] = f.getName().split("-");
			this.artista = s[0];
			this.nome = s[1].substring(0, s[1].length() - 4);
		}
		if (metadata.get("xmpDM:duration") != null) {
			this.duracao = (int)Double.parseDouble(metadata.get("xmpDM:duration"));
		}else {
			this.duracao = 0;
		}
		this.filePath = f.getPath();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return this.artista + " - " + this.nome;
	}
	
}
