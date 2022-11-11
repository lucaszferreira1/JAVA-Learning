
public class Documento extends Arquivo{
	private String texto;

	public Documento(String nome, String texto) throws NomeInvalidoException {
		super(nome, ".txt");
		this.texto = texto;
	}
	
	@Override
	public String toString() {
		return super.getNome() + super.getExtensao();
	}
}
