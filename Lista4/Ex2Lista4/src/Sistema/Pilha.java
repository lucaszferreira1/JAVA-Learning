package Sistema;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

import Exceptions.FullStackException;

public class Pilha<T> {
	private int limite;
	private List<T> elementos = new ArrayList<T>();
	
	public Pilha(int limite) {
		this.limite = limite;
	}
	
	public void inserir(T objeto) throws FullStackException {
		elementos.add(objeto);
	}
	
	public void remover() {
		if (getSize() == 0) {
			throw new EmptyStackException();
		}else {
			elementos.remove(getSize() - 1);
		}		
	}
	
	public int getSize() {
		return elementos.size();
	}
}
