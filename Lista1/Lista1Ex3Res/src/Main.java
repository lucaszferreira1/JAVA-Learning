
public class Main {
	public static Imobiliaria imobiliaria = new Imobiliaria();
	
	public static void imprimirImoveis(Imovel[] imoveis) {
		for (int i=0;i<imobiliaria.getnImoveis();i++) {
				System.out.println("C = " + imoveis[i].getComprimento() + "   L = " + imoveis[i].getLargura() + "   A = " + imoveis[i].getArea());
		}
	}
	
	public static void main(String args[]) {
		Imovel teste = new Imovel();
		teste.setComprimento(12);
		teste.setLargura(15);
		teste.setPreco(1500);
		
		Imovel teste_2 = new Imovel();
		teste_2.setComprimento(14);
		teste_2.setLargura(13);
		teste_2.setPreco(1700);
		
		Imovel teste_3 = new Imovel();
		teste_3.setComprimento(17);
		teste_3.setLargura(14);
		teste_3.setPreco(1800);
		
		Imovel teste_4 = new Imovel();
		teste_4.setComprimento(20);
		teste_4.setLargura(14);
		teste_4.setPreco(1900);
		
		imobiliaria.setImovel(teste);
		imobiliaria.setImovel(teste_2);
		imobiliaria.setImovel(teste_3);
		imobiliaria.setImovel(teste_4);
		
		imprimirImoveis(imobiliaria.filtrarPorArea(25));
		
	}
}
