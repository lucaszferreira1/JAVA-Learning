package Beans;

public class Camera {
	private int id;
	private String dt_utlimaGrava;
	private Local local;

	public Camera(int id, String dt_utlimaGrava, Local local) {
		super();
		this.id = id;
		this.dt_utlimaGrava = dt_utlimaGrava;
		this.local = local;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDt_utlimaGrava() {
		return dt_utlimaGrava;
	}

	public void setDt_utlimaGrava(String dt_utlimaGrava) {
		this.dt_utlimaGrava = dt_utlimaGrava;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}
	
	public String toString() {
		String str = this.id + " - " + this.dt_utlimaGrava;
		if (this.local != null)
			str += ", Local: " + this.local.getNome();
		return str;
	}
}
