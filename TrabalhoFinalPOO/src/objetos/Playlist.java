package objetos;

import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import sistemas.FileHandling;

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
	
	public void addMusica(Musica musica) {
		this.musicas.add(musica);
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}
	
	public void setAllSongs(){
		this.musicas.clear();
		try {
			FileHandling fileHandler = new FileHandling();
			int i = 0;
			for(File f : fileHandler.getFiles()) {
				Musica mus = new Musica();
				mus.fileToMusica(f);
				this.musicas.add(mus);
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return nome + " -> " + musicas.size() + " músicas";
	}
}
