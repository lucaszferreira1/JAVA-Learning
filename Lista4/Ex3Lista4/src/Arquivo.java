
public abstract class Arquivo {
	private String nome, extensao;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getExtensao() {
		return extensao;
	}

	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}

	public Arquivo(String nome, String extensao) throws NomeInvalidoException {
		String msg = verificaNome(nome);
		if (msg != null) {
			throw new NomeInvalidoException(msg);
		}else {
			this.nome = nome;
			this.extensao = extensao;
		}
	}
	
	private String verificaNome(String nome) {
		if (nome.contains("\n")) {
			return "Nome não pode conter quebra de linhas";
		}else if(nome.contains("[") || nome.contains("]") || nome.contains("(") || nome.contains(")")) {
			return "Nome não pode conter colchetes ou parênteses";
		}else if(nome.contains("'") || nome.contains("\"")) {
			return "Nome não pode conter aspas simples ou dupla";
		}else if(nome.length() < 10 || nome.length() > 256) {
			return "Nome deve conter entre 10 e 256 caracteres";
		}else {
			return null;
		}
	}
}
