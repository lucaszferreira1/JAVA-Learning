
public class Funcionario {
	public String nome;
	public int cpf;
	public int nVendas;
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", nVendas=" + nVendas + "]";
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
	public int getnVendas() {
		return nVendas;
	}
	public void setnVendas(int nVendas) {
		this.nVendas = nVendas;
	}
}