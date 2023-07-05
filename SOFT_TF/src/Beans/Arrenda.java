package Beans;

public class Arrenda {
	private int id;
	private String tipo;
	private Local local;
	private Companhia dono;
	
	public Arrenda(int id, String tipo, Local local, Companhia dono) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.local = local;
		this.dono = dono;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Companhia getDono() {
		return dono;
	}

	public void setDono(Companhia dono) {
		this.dono = dono;
	}
	
	public String toString() {
		String str = this.id + " - " + this.tipo;
		if (this.local != null)
			str += ", Local: " + this.local.getNome();
		if (this.dono != null)
			str += ", Dono: " + this.dono.getNome();
		return str;
	}
}
