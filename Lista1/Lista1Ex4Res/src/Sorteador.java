import java.util.concurrent.ThreadLocalRandom;

public class Sorteador {
	private Pessoa[] pessoas = new Pessoa[64];
	private int nPessoas = 0;
	
	public Pessoa[] getPessoas() {
		return pessoas;
	}
	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoas[nPessoas] = pessoa;
		nPessoas++;
	}

	public Pessoa sortearProximo() {
		int escolha = ThreadLocalRandom.current().nextInt(0, nPessoas);
		return pessoas[escolha];
	}
}
