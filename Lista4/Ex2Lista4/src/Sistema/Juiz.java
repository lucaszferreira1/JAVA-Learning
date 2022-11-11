package Sistema;

import Exceptions.FullStackException;

public class Juiz {
	private int lim;
	private Pilha<Processo> processos = new Pilha<Processo>(lim);
	private String nome;
	
	public Juiz(int lim) {
		this.lim = lim;
	}
	
	public Juiz(int lim, String nome) {
		this.lim = lim;
		this.nome = nome;
	}
	
	public void cadastrarProcesso(Processo pro) throws FullStackException {
		processos.inserir(pro);
	}

	public int getLim() {
		return lim;
	}

	public void setLim(int lim) {
		this.lim = lim;
	}

	public Pilha<Processo> getProcessos() {
		return processos;
	}

	public void setProcessos(Pilha<Processo> processos) {
		this.processos = processos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
