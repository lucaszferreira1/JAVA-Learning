import java.util.List;

public class Main {
	public static void printMatriz(Grafo mat) {
		List<List<Boolean>> lista = mat.getMatriz();
		for (List<Boolean> l : lista) {
			for	(boolean b : l) {
				if (b) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Grafo mat = new Grafo();
		mat.adicionarVertice();
		mat.adicionarVertice();
		mat.adicionarVertice();
		mat.adicionarVertice();
		mat.adicionarVertice();
		mat.adicionarAresta(0, 1);
		mat.adicionarAresta(0, 2);
		mat.adicionarAresta(1, 1);
		mat.adicionarAresta(1, 2);
		mat.adicionarAresta(1, 3);
		mat.adicionarAresta(1, 4);
		mat.adicionarAresta(2, 3);
		mat.adicionarAresta(3, 4);
		
		Grafo mat2 = new Grafo();
		mat2.setMatrizAdjacencia(false);
		mat2.adicionarVertice();
		mat2.adicionarVertice();
		mat2.adicionarVertice();
		mat2.adicionarVertice();
		mat2.adicionarVertice();
		mat2.adicionarAresta(0, 1);
		mat2.adicionarAresta(0, 2);
		mat2.adicionarAresta(1, 1);
		mat2.adicionarAresta(1, 3);
		mat2.adicionarAresta(2, 0);
		mat2.adicionarAresta(2, 1);
		mat2.adicionarAresta(2, 3);
		mat2.adicionarAresta(3, 4);
		mat2.adicionarAresta(4, 1);
		
		
		printMatriz(mat);
		System.out.println();
		printMatriz(mat2);
	}
}
