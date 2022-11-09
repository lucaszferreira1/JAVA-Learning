package negocio;

public class Musica {
	private String nome, filePath, artista;

	public Musica() {
	}
	
	public Musica(String nome, String filePath) {
		super();
		this.nome = nome;
		this.filePath = filePath;
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
	
}
