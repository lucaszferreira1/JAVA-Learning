package Beans;

public class Local {
	private int id;
	private String nome, coordenadas, tipo;
	
	public Local(int id, String nome, String coordenadas, String tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.coordenadas = coordenadas;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		return this.id + " - " + this.nome + ", Tipo: " + this.tipo + ", Coordenadas: " + this.coordenadas;
	}
}
