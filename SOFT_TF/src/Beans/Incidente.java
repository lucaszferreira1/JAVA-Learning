package Beans;

public class Incidente {
	private int id;
	private String descricao, dt, tipo;
	private Local local;
	private Funcionario responsavel;
	
	public Incidente(int id, String descricao, String dt, String tipo, Local local, Funcionario responsavel) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.dt = dt;
		this.tipo = tipo;
		this.local = local;
		this.responsavel = responsavel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
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

	public Funcionario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}
	
	public String toString() {
		String str = this.id + " - " + this.descricao + ", Data: " + this.dt + ", Tipo: " + this.tipo;
		if (this.local != null)
			str += ", Local: " + this.local.getNome();
		if (this.responsavel != null)
			str += ", Responsável: " + this.responsavel.getNome();
		return str;
	}
}
