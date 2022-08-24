
public class Main {
	
	
	public static void main(String args[]) {
		Pessoa p1 = new Pessoa();
		p1.setNome("José");
		p1.setIdade(19);
		p1.setAltura(1.87);
		p1.setMassa(69.7);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("José2");
		p2.setIdade(15);
		p2.setAltura(1.56);
		p2.setMassa(60.6);
		
		Pessoa p3 = new Pessoa();
		p3.setNome("José3");
		p3.setIdade(13);
		p3.setAltura(1.13);
		p3.setMassa(78.1);
		
		Pessoa p4 = new Pessoa();
		p4.setNome("José4");
		p4.setIdade(17);
		p4.setAltura(1.77);
		p4.setMassa(55.3);
		
		Pessoa p5 = new Pessoa();
		p5.setNome("José5");
		p5.setIdade(16);
		p5.setAltura(1.62);
		p5.setMassa(100.2);
		
		Grupo teste = new Grupo(0, null);
		teste.setPessoa(p1);
		teste.setPessoa(p2);
		teste.setPessoa(p3);
		teste.setPessoa(p4);
		teste.setPessoa(p5);

		teste.orderByIMC();
		for (int i=0;i<5;i++) {
			System.out.println(teste.pessoas[i].nome + "   " + teste.pessoas[i].CalcularIMC());
		}
	}
}
