import java.util.Arrays;

public class Supermercado {
	public Prateleira[] prateleiras = new Prateleira[50];
	public Endereco endereco = new Endereco();
	public int nPrat = 0, nVendas = 0;
	public float dinheiro = 0;

	
	@Override
	public String toString() {
		return "Supermercado [prateleiras=" + Arrays.toString(prateleiras) + ", endereco=" + endereco + ", nPrat=" + nPrat + ", nVendas=" + nVendas + ", dinheiro=" + dinheiro + "]";
	}
	public Prateleira[] getPrateleiras() {
		return prateleiras;
	}
	public void setPrateleiras(Prateleira[] prateleiras) {
		this.prateleiras = prateleiras;
	}
	public void setPrateleira(Prateleira prateleira) {
		this.prateleiras[nPrat] = prateleira;
		nPrat++;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getnPrat() {
		return nPrat;
	}
	public void setnPrat(int nPrat) {
		this.nPrat = nPrat;
	}
	public float getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(float dinheiro) {
		this.dinheiro = dinheiro;
	}
	public int getnVendas() {
		return nVendas;
	}
	public void setnVendas(int nVendas) {
		this.nVendas = nVendas;
	}
	public void venda(Item itemVendido, int quantVendido) {
		if (itemVendido.verificaEstoque(quantVendido)) {
			
		}
			
		
		itemVendido.reduzirEstoque(quantVendido);
		
		this.dinheiro += itemVendido.getPreco() * quantVendido;
		this.nVendas++;
	}
}
