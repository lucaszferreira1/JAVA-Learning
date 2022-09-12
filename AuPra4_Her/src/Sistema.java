
public class Sistema {
	private int quantidade;
	ContaBancaria contasBancarias[] = new ContaBancaria[64];
	
	public void cadastrarConta(ContaBancaria conta) {
		this.contasBancarias[this.quantidade] = conta;
		this.quantidade++;
	}
	
	public void realizarSaque(ContaBancaria conta, float valor) {
		conta.sacar(valor);
	}
	
	public boolean realizarDeposito(ContaCorrente conta, float valor) {
		return conta.depositar(valor);
	}
	
	public boolean realizarDeposito(ContaSalario conta, float valor, int cnpj) {
		return conta.depositar(valor, cnpj);
	}
	
	public ContaBancaria[] getContas() {
		return this.contasBancarias;
	}
	
	public ContaCorrente[] getContasCorrentes() {
		int max = 0;
		
		for (int i=0;i<this.quantidade;i++) {
			if (this.contasBancarias[i] instanceof ContaCorrente) {
				max++;
			}
		}
		int quant = 0;
		ContaCorrente contasCorrentes[] = new ContaCorrente[max];
		for (int i=0;i<this.quantidade;i++) {
			if (this.contasBancarias[i] instanceof ContaCorrente) {
				contasCorrentes[quant] = (ContaCorrente) this.contasBancarias[i];
				quant++;
			}
		}
		return contasCorrentes;
	}
	
	public ContaSalario[] getContasSalario() {
		int max = 0;
		
		for (int i=0;i<this.quantidade;i++) {
			if (this.contasBancarias[i] instanceof ContaSalario) {
				max++;
			}
		}
		int quant = 0;
		ContaSalario contasSalarios[] = new ContaSalario[max];
		for (int i=0;i<this.quantidade;i++) {
			if (this.contasBancarias[i] instanceof ContaSalario) {
				contasSalarios[quant] = (ContaSalario) this.contasBancarias[i];
				quant++;
			}
		}
		return contasSalarios;
	}
	
	public String obterExtrato(ContaBancaria conta) {
		return conta.gerarExtrato();
	}
	
	public ContaBancaria getContaByCPF(int cpf) {
		for (int i=0;i<this.quantidade;i++) {
			if (this.contasBancarias[i].getCpf() == cpf) {
				return contasBancarias[i];
			}
		}
		return null;
	}
}
