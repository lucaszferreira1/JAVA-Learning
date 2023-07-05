package controllers;

import java.util.ArrayList;

import Beans.Arrenda;

public class ArrendaContr {
	private ArrayList<Object> arrendas = new ArrayList<>();
	
	public void add(Arrenda a) {
		this.arrendas.add(a);
	}
	
	public Object get(int index) {
		return this.arrendas.get(index);
	}
	
	public ArrayList<Object> getArrendas() {
		return this.arrendas;
	}
	
	public void remove(int index) {
		this.arrendas.remove(index);
	}
	
	public void remove(Object o) {
		this.arrendas.remove(o);
	}
}
