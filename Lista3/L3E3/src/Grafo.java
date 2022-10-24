import java.util.ArrayList;
import java.util.List;

public class Grafo {
	private List<List<Boolean>> matriz = new ArrayList<>();
	private boolean matrizAdjacencia = true;

	public List<List<Boolean>> getMatriz() {
		return matriz;
	}

	public void setMatriz(List<List<Boolean>> matriz) {
		this.matriz = matriz;
	}
	
	public boolean isMatrizAdjacencia() {
		return matrizAdjacencia;
	}

	public void setMatrizAdjacencia(boolean matrizAdjacencia) {
		this.matrizAdjacencia = matrizAdjacencia;
	}

	public void adicionarAresta(int i, int j) {
		matriz.get(i).set(j, true);
		if (this.matrizAdjacencia)
			matriz.get(j).set(i, true);
	}
	
	public void adicionarVertice() {
		int tam = matriz.size();
		List<Boolean> create = new ArrayList<>();
		matriz.add(create);
		for (int i=0;i<tam;i++) {
			matriz.get(tam).add(false);
		}
		for (int i=0;i<tam+1;i++) {
			matriz.get(i).add(false);
		}
	}
}
