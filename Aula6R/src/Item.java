
public class Item {
	public String nome, desc;
	public int quantidade;
	public float preco;
	
	@Override
	public String toString() {
		return "Item [nome=" + nome + ", desc=" + desc + ", quantidade=" + quantidade + ", preco=" + preco + "]";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public boolean verificaEstoque(int quantVendido) {
		if (quantVendido > quantidade) {
			return false;
		}else {
			return true;
		}
	}
	public void reduzirEstoque(int quantVendido) {
		this.quantidade -= quantVendido;
	}
}