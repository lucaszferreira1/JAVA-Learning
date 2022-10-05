public class Main {
	public static void main(String args[]) {
		Abundantes abundantes = new Abundantes();
		abundantes.gerar(10);
		System.out.println(abundantes.getSequencia());
		
		
		Fatoriais fatoriais = new Fatoriais();
		fatoriais.gerar(10);
		System.out.println(fatoriais.getSequencia());
		
		
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.gerar(10);
		System.out.println(fibonacci.getSequencia());
		
		
		Naturais naturais = new Naturais();
		naturais.gerar(10);
		System.out.println(naturais.getSequencia());
		System.out.println(naturais.sortear());
		System.out.println(naturais.somatorio());
		System.out.println(naturais.mediaAritmetica());
		System.out.println(naturais.mediaGeometrica());
		System.out.println(naturais.variancia());
		System.out.println(naturais.desvioPadrao());
		System.out.println(naturais.amplitude());
		
		
		NumeroPrimos primos = new NumeroPrimos();
		primos.gerar(10);
		System.out.println(primos.getSequencia());
		
		
		Perfeitos perfeitos = new Perfeitos();
		perfeitos.gerar(4);
		System.out.println(perfeitos.getSequencia());
		
		
		Quadrados quadrados = new Quadrados();
		quadrados.gerar(10);
		System.out.println(quadrados.getSequencia());	
	}
}
