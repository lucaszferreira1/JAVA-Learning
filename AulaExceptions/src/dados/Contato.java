package dados;

public class Contato {
	private String dados;
	private int telefone;
	
	public String getDados() {
		return dados;
	}

	public void setDados(String dados) {
		this.dados = dados;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
