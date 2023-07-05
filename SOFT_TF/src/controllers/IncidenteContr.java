package controllers;

import java.util.ArrayList;

import Beans.Incidente;

public class IncidenteContr {
	private ArrayList<Object> incidentes = new ArrayList<>();
	
	public void add(Incidente i) {
		this.incidentes.add(i);
	}
	
	public Object get(int index) {
		return this.incidentes.get(index);
	}
	
	public ArrayList<Object> getIncidentes() {
		return this.incidentes;
	}
	
	public void remove(int index) {
		this.incidentes.remove(index);
	}
	
	public void remove(Object o) {
		this.incidentes.remove(o);
	}
}
