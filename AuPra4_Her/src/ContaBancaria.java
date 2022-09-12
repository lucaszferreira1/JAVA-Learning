
public class ContaBancaria {
	private int cpf;
	protected float saldo;
	
	public ContaBancaria(int cpf, float saldo) {
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float sacar(float valor) {
		if (this.saldo >= valor) {
			saldo -= valor;
			return valor;
		}else {
			return 0;
		}
	}
	
	public String gerarExtrato() {
		return "CPF: " + this.cpf + "Saldo: " + this.saldo;
	}
}
