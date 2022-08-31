package negocio;
import dados.Cidade;
import dados.Cliente;
import dados.Reserva;

public class ReservaPassagem {
	public Cidade listaDeCidades[] = new Cidade[64];
	public Cliente listaDeClientes[] = new Cliente[64];
	public int nClientes = 0, nCidades = 0, ultReserva = 0;

	public Cidade[] mostrarCidades() {
		return listaDeCidades;
	}

	public void setListaDeCidades(Cidade[] listaDeCidades) {
		this.listaDeCidades = listaDeCidades;
	}

	public Cliente[] mostrarClientes() {
		return listaDeClientes;
	}

	public void setListaDeClientes(Cliente[] listaDeClientes) {
		this.listaDeClientes = listaDeClientes;
	}

	public int getnClientes() {
		return nClientes;
	}

	public void setnClientes(int nClientes) {
		this.nClientes = nClientes;
	}

	public int getnCidades() {
		return nCidades;
	}

	public void setnCidades(int nCidades) {
		this.nCidades = nCidades;
	}

	public int getUltReserva() {
		return ultReserva;
	}

	public void setUltReserva(int ultReserva) {
		this.ultReserva = ultReserva;
	}

	public void cadastrarCliente(Cliente cliente) {
		listaDeClientes[nClientes] = cliente;
		nClientes++;
	}
	
	public void cadastrarCidade(Cidade cidade) {
		listaDeCidades[nCidades] = cidade;
		nCidades++;
	}
	
	public void reservar(Cliente cliente, Reserva reserva) {
		cliente.setReserva(reserva);
		cliente.getReservas()[cliente.getnReservas()].setNumReserva(ultReserva);
		ultReserva++;
	}
	
//	public void reservarVolta(Cliente cliente, Reserva ida, Reserva volta) {
//		ultReserva++;
//	}
	
	public Reserva[] mostrarReservas(int cpfCliente) {
		return getClientePorCpf(cpfCliente).getReservas();
	}
	
	public Cliente getClientePorCpf(int cpfCliente) {
		for (int i=0;i<nClientes;i++) {
			if (cpfCliente == listaDeClientes[i].getCpf()) {
				return listaDeClientes[i];
			}
		}
		return null;
	}
}
