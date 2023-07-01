package Principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Beans.*;

public class Sistema {
	private Scanner in = new Scanner(System.in);
	
	private ArrayList<Object> arrendas = new ArrayList<>();
	private ArrayList<Object> barcos = new ArrayList<>();
	private ArrayList<Object> cameras = new ArrayList<>();
	private ArrayList<Object> companhias = new ArrayList<>();
	private ArrayList<Object> funcionarios = new ArrayList<>();
	private ArrayList<Object> incidentes = new ArrayList<>();
	private ArrayList<Object> locais = new ArrayList<>();
	
	public Sistema() {
		funcionarios.add(new Funcionario(0, "Nenhum", "Nenhum", "Nenhum", "Nenhum", "Nenhum"));
		locais.add(new Local(0, "Nenhum", "0", "Nenhum"));
		companhias.add(new Companhia(0, "Nenhuma", "Nenhum", "Nenhum", "Nenhum", (Funcionario)funcionarios.get(0)));
		arrendas.add(new Arrenda(0, "Nenhuma", (Local)locais.get(0), (Companhia)companhias.get(0)));
		barcos.add(new Barco(0, "Nenhum", "Nenhum", (Funcionario)funcionarios.get(0), (Companhia)companhias.get(0), (Local)locais.get(0)));
		cameras.add(new Camera(0, "0-0-0", (Local)locais.get(0)));
		incidentes.add(new Incidente(0, "Nenhum", "0-0-0", "Nenhum", (Local)locais.get(0), (Funcionario)funcionarios.get(0)));

		locais.add(new Local(1, "Local de Testes", "837465", "Doca"));
		funcionarios.add(new Funcionario(1, "Lucas", "Testador", "teste@gmail.com", "9283456", "8374652"));
		companhias.add(new Companhia(1, "Companhia de Testes", "aksmhjkdfg@alk.com", "3984756", "9238465", (Funcionario)funcionarios.get(1)));
		barcos.add(new Barco(1, "Barco Testado", "Lancha", (Funcionario)funcionarios.get(1), (Companhia)companhias.get(1), (Local)locais.get(0)));
	}
	
	private void listAll(ArrayList<Object> lista) {
		Iterator<Object> it = lista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	
	private Arrenda askArrenda() {
		System.out.println("Escolha a Arrenda: ");
		listAll(arrendas);
		try {
			int id = in.nextInt();
			in.nextLine();
			Arrenda arre = (Arrenda)arrendas.get(id);
			return arre;
		} catch(Exception e) {
			System.err.println("Arrenda escolhida não existe");
		}
		return null;
	}
	
	private Barco askBarco() {
		System.out.println("Escolha o Barco: ");
		listAll(barcos);
		try {
			int id = in.nextInt();
			in.nextLine();
			Barco barco = (Barco)barcos.get(id);
			return barco;
		} catch(Exception e) {
			System.err.println("Barco escolhido não existe");
		}
		return null;
	}
	
	private Camera askCamera() {
		System.out.println("Escolha a Câmera: ");
		listAll(cameras);
		try {
			int id = in.nextInt();
			in.nextLine();
			Camera cam = (Camera)cameras.get(id);
			return cam;
		} catch(Exception e) {
			System.err.println("Câmera escolhida não existe");
		}
		return null;
	}
	
	private Companhia askCompanhia() {
		System.out.println("Escolha a Companhia: ");
		listAll(companhias);
		try {
			int id = in.nextInt();
			in.nextLine();
			Companhia comp = (Companhia)companhias.get(id);
			return comp;
		} catch(Exception e) {
			System.err.println("Companhia escolhida não existe");
		}
		return null;
	}
	
	private Funcionario askFuncionario() {
		System.out.println("Escolha o Funcionário: ");
		listAll(funcionarios);
		try {
			int id = in.nextInt();
			in.nextLine();
			Funcionario func = (Funcionario)funcionarios.get(id);
			return func;
		} catch(Exception e) {
			System.err.println("Funcionário escolhido não existe");
		}
		return null;
	}
	
	private Incidente askIncidente() {
		System.out.println("Escolha o Incidente: ");
		listAll(incidentes);
		try {
			int id = in.nextInt();
			in.nextLine();
			Incidente inc = (Incidente)incidentes.get(id);
			return inc;
		} catch(Exception e) {
			System.err.println("Incidente escolhido não existe");
		}
		return null;
	}
	
	private Local askLocal() {
		System.out.println("Escolha o Local: ");
		listAll(locais);
		try {
			int id = in.nextInt();
			in.nextLine();
			Local local = (Local)locais.get(id);
			return local;
		} catch(Exception e) {
			System.err.println("Local escolhido não existe");
		}
		return null;
	}
	
	public int getLastId(ArrayList<Object> lista) {
		return (lista.size() - 1);	
	}
	
	public void addArrenda(int idd) {
		System.out.println("Tipo: ");
		String tipo = in.nextLine();
		Local local = askLocal();
		Companhia comp = askCompanhia();
		if (idd == 0)
			idd = getLastId(arrendas) + 1;
		arrendas.add(new Arrenda(idd, tipo, local, comp));
	}
	
	public void addBarco(int idd) {
		System.out.println("Nome: ");
		String nome = in.nextLine();
		System.out.println("Tipo: ");
		String tipo = in.nextLine();
		Local local = askLocal();
		Companhia comp = askCompanhia();
		Funcionario func = askFuncionario();	
		if (idd == 0)
			idd = getLastId(barcos) + 1;
		barcos.add(new Barco(idd, nome, tipo, func, comp, local));
	}
	
	public void addCamera(int idd) {
		System.out.println("Data da última gravação: ");
		String dt = in.nextLine();
		Local local = askLocal();
		if (idd == 0)
			idd = getLastId(cameras) + 1;
		cameras.add(new Camera(idd, dt, local));
	}
	
	public void addCompanhia(int idd) {
		System.out.println("Nome: ");
		String nome = in.nextLine();
		System.out.println("Email: ");
		String email = in.nextLine();
		System.out.println("Fone: ");
		String fone = in.nextLine();
		System.out.println("CNPJ: ");
		String cnpj = in.nextLine();
		Funcionario resp = askFuncionario();
		if (idd == 0)
			idd = getLastId(companhias) + 1;
		
		companhias.add(new Companhia(idd, nome, email, fone, cnpj, resp));
	}
	
	public void addFuncionario(int idd) {
		System.out.println("Nome: ");
		String nome = in.nextLine();
		System.out.println("Trabalho: ");
		String trabalho = in.nextLine();
		System.out.println("Email: ");
		String email = in.nextLine();
		System.out.println("Fone: ");
		String fone = in.nextLine();
		System.out.println("CPF: ");
		String cpf = in.nextLine();
		if (idd == 0)
			idd = getLastId(funcionarios) + 1; 
		funcionarios.add(new Funcionario(idd, nome, trabalho, email, fone, cpf));
	}
	
	public void addIncidente(int idd) {
		System.out.println("Descrição: ");
		String desc = in.nextLine();
		System.out.println("Data do Incidente: ");
		String dt = in.nextLine();
		System.out.println("Tipo do Incidente: ");
		String tipo = in.nextLine();
		Local local = askLocal();
		Funcionario resp = askFuncionario();
		if (idd == 0)
			idd = getLastId(incidentes) + 1;
		
		incidentes.add(new Incidente(idd, desc, dt, tipo, local, resp));
	}
	
	public void addLocal(int idd) {
		System.out.println("Nome: ");
		String nome = in.nextLine();
		System.out.println("Coordenada: ");
		String coord = in.nextLine();
		System.out.println("Tipo: ");
		String tipo = in.nextLine();
		if (idd == 0)
			idd = getLastId(locais) + 1;
		locais.add(new Local(idd, nome, coord, tipo));
	}
	
	public void listArrendas() {
		listAll(arrendas);
	}
	
	public void listBarcos() {
		listAll(barcos);
	}
	
	public void listCameras() {
		listAll(cameras);
	}
	
	public void listCompanhias() {
		listAll(companhias);
	}
	
	public void listFuncionarios() {
		listAll(funcionarios);
	}
	
	public void listIncidentes() {
		listAll(incidentes);
	}
	
	public void listLocais() {
		listAll(locais);
	}
	
	public void alterArrenda() {
		Arrenda arre = askArrenda();
		addArrenda(arre.getId());
		arrendas.remove(arre);
	}
	
	public void alterBarco() {
		Barco barco = askBarco();
		addBarco(barco.getId());
		barcos.remove(barco);
	}
	
	public void alterCamera() {
		Camera cam = askCamera();
		addCamera(cam.getId());
		cameras.remove(cam);
	}
	
	public void alterCompanhia() {
		Companhia comp = askCompanhia();
		addCompanhia(comp.getId());
		companhias.remove(comp);
	}
	
	public void alterFuncionario() {
		Funcionario func = askFuncionario();
		addFuncionario(func.getId());
		funcionarios.remove(func);
	}
	
	public void alterIncidente() {
		Incidente inc = askIncidente();
		addIncidente(inc.getId());
		incidentes.remove(inc);
	}
	
	public void alterLocal() {
		Local local = askLocal();
		addLocal(local.getId());
		locais.remove(local);
	}
	
	private ArrayList<Object> getBarcosAtracados() {
		Iterator<Object> it = barcos.iterator();
		ArrayList<Object> lista = new ArrayList<>();
		Barco barco = new Barco();
		while(it.hasNext()) {
			barco = (Barco)it.next();
			if (barco.hasLocal())
				lista.add(barco);
		}
		return lista;
	}
	
	private ArrayList<Object> getBarcosCCapitaes() {
		Iterator<Object> it = barcos.iterator();
		ArrayList<Object> lista = new ArrayList<>();
		Barco barco = new Barco();
		while(it.hasNext()) {
			barco = (Barco)it.next();
			if (barco.hasCapitao())
				lista.add(barco);
		}
		return lista;
	}
	
	public void listBarcosAtracados() {
		listAll(getBarcosAtracados());
	}
	
	public void listBarcosCCapitaes() {
		listAll(getBarcosCCapitaes());
	}
	
	public void addCapitaoBarco() {
		Barco barco = askBarco();
		Funcionario cap = askFuncionario();
		barco.addCapitao(cap);
		System.out.println(cap.getNome() + " agora será o capitão do barco " + barco.getNome());
	}
	
	public void listHistoricoCapitao() {
		Barco barco = askBarco();
		listAll(barco.getCapitaes());
	}
	
	private ArrayList<Object> getBarcosNoLocal(Local local){
		Iterator<Object> it = barcos.iterator();
		ArrayList<Object> lista = new ArrayList<>();
		Barco barco;
		while(it.hasNext()) {
			barco = (Barco)it.next();
			if (barco.getLocal().equals(local))
				lista.add(barco);
		}
		
		return lista;
	}
	
	public void listBarcosNoLocal() {
		Local local = askLocal();
		listAll(getBarcosNoLocal(local));
	}
}
