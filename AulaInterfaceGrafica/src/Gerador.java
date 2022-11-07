import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Gerador implements ISequencia{
	protected List<Integer> sequencia = new ArrayList<Integer>();
	
	public List<Integer> getSequencia() {
		return sequencia;
	}

	public void setSequencia(List<Integer> sequencia) {
		this.sequencia = sequencia;
	}

	public abstract void gerar(int quantidade);

	@Override
	public int sortear() {
		Random r = new Random();
		return this.sequencia.get(r.nextInt(sequencia.size()));
	}

	@Override
	public long somatorio() {
		long result = 0;
		for(int element : this.sequencia) {
			result += element;
		}
		return result;
	}

	@Override
	public double mediaAritmetica() {
		double media = somatorio() / this.sequencia.size();
		return media;
	}

	@Override
	public double mediaGeometrica() {
		double mediaG = Math.pow(somatorio(), (1.0 / this.sequencia.size()));
		return mediaG;
	}

	@Override
	public double variancia() {
		double variancia = 0;
		for (int element : this.sequencia) {
			variancia += Math.pow((element - mediaAritmetica()), 2);
		}
		return (variancia / sequencia.size());
	}

	@Override
	public double desvioPadrao() {
		double desvioPadrao = 0;
		for (int element : this.sequencia) {
			desvioPadrao += Math.pow((element - mediaAritmetica()), 2);
		}
		return (Math.sqrt((desvioPadrao/3)));
	}

	@Override
	public long amplitude() {
		return max() - min();
	}
	
	private int min() {
		int menor = this.sequencia.get(0);
		for (int element : this.sequencia) {
			if (element < menor) {
				menor = element;
			}
		}
		return menor;
	}
	
	private int max() {
		int maior = this.sequencia.get(0);
		for (int element : this.sequencia) {
			if (element > maior) {
				maior = element;
			}
		}
		return maior;
	}
}