package Beans;

public class CapitaoBean {
	private int barco;
	private int funcionario;
	
	public CapitaoBean(int barco, int funcionario) {
		this.barco = barco;
		this.funcionario = funcionario;
	}

	public int getBarco() {
		return barco;
	}

	public void setBarco(int barco) {
		this.barco = barco;
	}

	public int getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(int funcionario) {
		this.funcionario = funcionario;
	}
}
