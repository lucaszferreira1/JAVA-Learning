package negocio;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
	private String nome;
	private List<Musica> musicas = new ArrayList<Musica>();
	
	public Playlist() {
	}
	
	public Playlist(String nome, List<Musica> musicas) {
		super();
		this.nome = nome;
		this.musicas = musicas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}

	@Override
	public String toString() {
		return nome + " -> " + musicas.size() + " músicas";
	}
}
