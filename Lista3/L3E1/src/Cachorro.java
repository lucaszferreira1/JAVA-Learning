
public class Cachorro extends Animal{
	public String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String emitirSom() {
		return this.nome+": Au-Au";
	}
}
