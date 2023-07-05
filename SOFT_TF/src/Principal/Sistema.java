package Principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Beans.*;
import controllers.*;

public class Sistema {
	private Scanner in = new Scanner(System.in);
	
	private ArrendaContr arrendas = new ArrendaContr();
	private BarcoContr barcos = new BarcoContr();
	private CameraContr cameras = new CameraContr();
	private CompanhiaContr companhias = new CompanhiaContr();
	private FuncionarioContr funcionarios = new FuncionarioContr();
	private IncidenteContr incidentes = new IncidenteContr();
	private LocalContr locais = new LocalContr();
	
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
		barcos.add(new Barco(1, "Barco Testado", "Lancha", (Funcionario)funcionarios.get(1), (Companhia)companhias.get(1), (Local)locais.get(1)));
	}
	
	public int getLastId(ArrayList<Object> lista) {
		return (lista.size() - 1);	
	}
	
	private void listAll(ArrayList<Object> lista) {
		Iterator<Object> it = lista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	
	private Arrenda askArrenda() {
		System.out.println("Escolha a Arrenda: ");
		listAll(arrendas.getArrendas());
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
		listAll(barcos.getBarcos());
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
		listAll(cameras.getCameras());
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
		listAll(companhias.getCompanhias());
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
		listAll(funcionarios.getFuncionarios());
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
		listAll(incidentes.getIncidentes());
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
		listAll(locais.getLocais());
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
	
	public void addArrenda(int idd) {
		System.out.println("Tipo: ");
		String tipo = in.nextLine();
		Local local = askLocal();
		Companhia comp = askCompanhia();
		if (idd == 0)
			idd = getLastId(arrendas.getArrendas()) + 1;
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
			idd = getLastId(barcos.getBarcos()) + 1;
		barcos.add(new Barco(idd, nome, tipo, func, comp, local));
	}
	
	public void addCamera(int idd) {
		System.out.println("Data da última gravação: ");
		String dt = in.nextLine();
		Local local = askLocal();
		if (idd == 0)
			idd = getLastId(cameras.getCameras()) + 1;
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
			idd = getLastId(companhias.getCompanhias()) + 1;
		
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
			idd = getLastId(funcionarios.getFuncionarios()) + 1; 
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
			idd = getLastId(incidentes.getIncidentes()) + 1;
		
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
			idd = getLastId(locais.getLocais()) + 1;
		locais.add(new Local(idd, nome, coord, tipo));
	}
	
	public void listArrendas() {
		listAll(arrendas.getArrendas());
	}
	
	public void listBarcos() {
		listAll(barcos.getBarcos());
	}
	
	public void listCameras() {
		listAll(cameras.getCameras());
	}
	
	public void listCompanhias() {
		listAll(companhias.getCompanhias());
	}
	
	public void listFuncionarios() {
		listAll(funcionarios.getFuncionarios());
	}
	
	public void listIncidentes() {
		listAll(incidentes.getIncidentes());
	}
	
	public void listLocais() {
		listAll(locais.getLocais());
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
	
	public void listBarcosAtracados() {
		listAll(barcos.getBarcosAtracados());
	}
	
	public void listBarcosCCapitaes() {
		listAll(barcos.getBarcosCCapitaes());
	}
	
	public void addCapitaoBarco() {
		Barco barco = askBarco();
		Funcionario cap = askFuncionario();
		boolean isCap = barco.addCapitao(cap);
		if (isCap){
			System.out.println(cap.getNome() + " agora será o capitão do barco " + barco.getNome());
		}
	}
	
	public void listHistoricoCapitao() {
		Barco barco = askBarco();
		listAll(barco.getCapitaes());
	}
	
	
	public void listBarcosNoLocal() {
		Local local = askLocal();
		listAll(barcos.getBarcosNoLocal(local));
	}
}
