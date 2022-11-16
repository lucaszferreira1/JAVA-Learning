package objetos;

import java.io.File;

public class Musica {
	private String nome, filePath, artista;

	public Musica() {
	}
	
	public Musica(String nome, String filePath) {
		this.nome = nome;
		this.filePath = filePath;
	}
	
	public void fileToMusica(File f) {
		String s[] = f.getName().split("-");
		this.artista = s[0];
		this.nome = s[1];
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

	@Override
	public String toString() {
		return this.artista + " - " + this.nome;
	}
	
}
