package dados;

import java.util.Objects;

public class Reserva {
	public int numReserva, poltrona;
	public String dataVoo, horaVoo, classeVoo;
	public float preco;
	public boolean idaEVolta;
	public Cidade origem, destino;
	public Reserva volta = new Reserva();
	
	@Override
	public String toString() {
		return "Reserva [numReserva=" + numReserva + ", poltrona=" + poltrona + ", dataVoo=" + dataVoo + ", horaVoo="
				+ horaVoo + ", classeVoo=" + classeVoo + ", preco=" + preco + ", idaEVolta=" + idaEVolta + "]";
	}

	public int getNumReserva() {
		return numReserva;
	}

	public void setNumReserva(int numReserva) {
		this.numReserva = numReserva;
	}

	public int getPoltrona() {
		return poltrona;
	}

	public void setPoltrona(int poltrona) {
		this.poltrona = poltrona;
	}

	public String getDataVoo() {
		return dataVoo;
	}

	public void setDataVoo(String dataVoo) {
		this.dataVoo = dataVoo;
	}

	public String getHoraVoo() {
		return horaVoo;
	}

	public void setHoraVoo(String horaVoo) {
		this.horaVoo = horaVoo;
	}

	public String getClasseVoo() {
		return classeVoo;
	}

	public void setClasseVoo(String classeVoo) {
		this.classeVoo = classeVoo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public boolean isIdaEVolta() {
		return idaEVolta;
	}

	public void setIdaEVolta(boolean idaEVolta) {
		this.idaEVolta = idaEVolta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(classeVoo, dataVoo, horaVoo, idaEVolta, numReserva, poltrona, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(classeVoo, other.classeVoo) && Objects.equals(dataVoo, other.dataVoo)
				&& Objects.equals(horaVoo, other.horaVoo) && idaEVolta == other.idaEVolta
				&& numReserva == other.numReserva && poltrona == other.poltrona
				&& Float.floatToIntBits(preco) == Float.floatToIntBits(other.preco);
	}
	
}
