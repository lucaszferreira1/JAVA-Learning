package dados;

import java.util.Objects;

public class Cliente {
	public int cpf, telefone;
	public String nome, endereco;
	public Reserva reservas[] = new Reserva[64];
	public int nReservas = 0;
	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", telefone=" + telefone + ", nome=" + nome + ", endereco=" + endereco + "]";
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Reserva[] getReservas() {
		return reservas;
	}

	public void setReservas(Reserva[] reservas) {
		this.reservas = reservas;
	}
	
	public void setReserva(Reserva reserva) {
		this.reservas[nReservas] = reserva;
		this.nReservas++;
	}

	public int getnReservas() {
		return nReservas;
	}

	public void setnReservas(int nReservas) {
		this.nReservas = nReservas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, endereco, nome, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf && Objects.equals(endereco, other.endereco) && Objects.equals(nome, other.nome)
				&& telefone == other.telefone;
	}
	
	
}
