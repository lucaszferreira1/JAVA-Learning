import java.util.Arrays;

public class Imobiliaria {
	private String nome;
	private Imovel[] listaImoveis = new Imovel[64];
	private int nImoveis = 0;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Imovel[] getListaImoveis() {
		return listaImoveis;
	}
	public void setListaImoveis(Imovel[] listaImoveis) {
		this.listaImoveis = listaImoveis;
	}
	public void setImovel(Imovel imovel) {
		this.listaImoveis[nImoveis] = imovel;
		this.nImoveis++;
	}
	public int getnImoveis() {
		return nImoveis;
	}
	public void setnImoveis(int nImoveis) {
		this.nImoveis = nImoveis;
	}
	@Override
	public String toString() {
		return "Imobiliaria [nome=" + nome + ", listaImoveis=" + Arrays.toString(listaImoveis) + "]";
	}
	public Imovel[] filtrarPorArea(float area) {
		Imovel imoveis[] = new Imovel[64];
		int nImoveisFunc = 0;
		for (int i=0;i<nImoveis;i++) {
			if(listaImoveis[i].getArea() >= area) {
				imoveis[nImoveisFunc] = listaImoveis[i];
				nImoveisFunc++;
			}
		}
		for (int i=0;i<nImoveisFunc;i++) {
			for (int j=0;j<nImoveisFunc-1;j++) {
				if (imoveis[j].getArea() > imoveis[j+1].getArea()) {
					Imovel aux = imoveis[j];
					imoveis[j] = imoveis[j+1];
					imoveis[j+1] = aux;
				}
			}
		}
		return imoveis;
	}
}
