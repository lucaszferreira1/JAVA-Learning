
public class Cliente {
	public String nome;
	public int cpf;
	public int nCompras;
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", nCompras=" + nCompras + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getnCompras() {
		return nCompras;
	}
	public void setnCompras(int nCompras) {
		this.nCompras = nCompras;
	}
}
