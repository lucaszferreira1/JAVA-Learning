public class Naturais extends Gerador{
	public Naturais() {
		super();
	}

	public void gerar(int quantidade){
		for(int i=1;i<quantidade+1;i++)
			super.sequencia.add(i);
	}
}
