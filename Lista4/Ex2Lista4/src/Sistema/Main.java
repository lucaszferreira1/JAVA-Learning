package Sistema;

import Exceptions.FullStackException;
import Exceptions.ProcessoSemJuizException;

public class Main {
	public static void main(String args[]){
		SistemaProcessos sistema = new SistemaProcessos();
		sistema.cadastrarJuiz(new Juiz(20, "José"));
		sistema.cadastrarJuiz(new Juiz(20, "Joséfino"));
		sistema.cadastrarProcesso(new Processo("Venda"));
		
		try {
			sistema.distribuirProcessos();
		} catch (ProcessoSemJuizException e) {
			e.printStackTrace();
		} catch (FullStackException e) {
			e.printStackTrace();
		}
		for(Juiz j : sistema.getJuizes()) {
			System.out.println(j.getNome() + " - " + j.getProcessos().getSize() + " processo(s)");
		}
	}
}
