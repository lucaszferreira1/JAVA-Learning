
public class Main {
	public static void main(String args[]) throws NomeInvalidoException {
		SistemaArquivos sis = new SistemaArquivos();
		sis.criarMusica("Imagine Dragons - Radioactive", "Downloads", 276);
		sis.criarVideo("HIMYM S01E01", "Downloads", Qualidade.FULLHD);
		sis.criarDocumento("Lista de Compras", "Downloads", "nada");
		sis.criarDocumento("resumooooo", "Área de Trabalho", "nada aqui");
		sis.criarDocumento("notasPOOOO", "Área de Trabalho", "0, 0, 0, 0");
		System.out.println(sis.toString());
	}
}
