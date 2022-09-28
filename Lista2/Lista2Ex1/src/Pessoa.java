
public class Pessoa {
	private String nome, cidade;
	private int idade, cpf;
	public Pessoa(String nome, String cidade, int idade, int cpf) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.idade = idade;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "- " + nome + ", " + idade + ", " + cpf + ", " + cidade;
	}
}
