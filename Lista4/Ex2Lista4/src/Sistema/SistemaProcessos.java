package Sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Exceptions.FullStackException;
import Exceptions.ProcessoSemJuizException;

public class SistemaProcessos {
	public List<Juiz> juizes = new ArrayList<Juiz>();
	public List<Processo> processos = new ArrayList<Processo>();
	private int lastId = 0;
	
	public void cadastrarProcesso(Processo pro) {
		pro.setId(lastId);
		lastId++;
		processos.add(pro);
	}
	
	public void cadastrarJuiz(Juiz jui) {
		juizes.add(jui);
	}
	
	public void distribuirProcessos() throws ProcessoSemJuizException, FullStackException {
		Random gen = new Random();
		for (Processo p : this.processos) {
			int i = gen.nextInt(juizes.size());
			juizes.get(i).cadastrarProcesso(p);
		}
	}

	public List<Juiz> getJuizes() {
		return juizes;
	}

	public void setJuizes(List<Juiz> juizes) {
		this.juizes = juizes;
	}

	public List<Processo> getProcessos() {
		return processos;
	}

	public void setProcessos(List<Processo> processos) {
		this.processos = processos;
	}

	public int getLastId() {
		return lastId;
	}

	public void setLastId(int lastId) {
		this.lastId = lastId;
	}
}
