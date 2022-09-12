
public class ContaCorrente extends ContaBancaria{
	public ContaCorrente(int cpf, float saldo) {
		super(cpf, saldo);
	}

	public boolean depositar(float valor) {
		super.saldo += valor;
		return true;
	}
}
