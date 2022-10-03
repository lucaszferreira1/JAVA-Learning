
public class Complexo {
	private int real;
	private int imaginaria;
	
	public Complexo() {
	}
	
	public Complexo(int real, int imaginaria) {
		super();
		this.real = real;
		this.imaginaria = imaginaria;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginaria() {
		return imaginaria;
	}

	public void setImaginaria(int imaginaria) {
		this.imaginaria = imaginaria;
	}

	@Override
	public String toString() {
		return "Complexo [real=" + real + ", imaginaria=" + imaginaria + "]";
	}
}
