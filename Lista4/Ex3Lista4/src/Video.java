
public class Video extends Arquivo{
	private Qualidade qualidade;

	public Video(String nome, Qualidade qualidade) throws NomeInvalidoException {
		super(nome, ".mp4");
		this.qualidade = qualidade;
	}
	
	@Override
	public String toString() {
		return super.getNome() + super.getExtensao() + "\n	Qualidade: " + qualidade;
	}
}
