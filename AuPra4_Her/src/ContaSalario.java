
public class ContaSalario extends ContaBancaria{
	private int cnpjEmpresa;
	
	public ContaSalario(int cpf, float saldo, int cnpj) {
		super(cpf, saldo);
	}

	public boolean depositar(float valor, int cnpj) {
		if (cnpj == cnpjEmpresa) {
			this.saldo += valor;
			return true;
		}else {
			return false;
		}
	}
}
