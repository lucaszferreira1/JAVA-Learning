import java.util.Arrays;

public class Prateleira {
	public int nPrateleira, nItems;
	public Item[] itens = new Item[64];
	
	@Override
	public String toString() {
		return "Prateleira [nPrateleira=" + nPrateleira + ", itens=" + Arrays.toString(itens) + "]";
	}
	
	public int getnPrateleira() {
		return nPrateleira;
	}
	public void setnPrateleira(int nPrateleira) {
		this.nPrateleira = nPrateleira;
	}
	public Item[] getItens() {
		return itens;
	}
	public void setItens(Item[] itens) {
		this.itens = itens;
	}
	public void setItem(Item item) {
		this.itens[nItems] = item;
		nItems++;
	}
	
}