
public class Imovel {
	private float largura, comprimento, preco;
	
	
	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Imovel [largura=" + largura + ", comprimento=" + comprimento + ", preco=" + preco + "]";
	}

	public float getArea() {
		return largura * comprimento;
	}
}
