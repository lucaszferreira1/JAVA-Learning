
public class Pato extends Animal{
	public String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String emitirSom() {
		return this.nome+": Quack";
	}
}
