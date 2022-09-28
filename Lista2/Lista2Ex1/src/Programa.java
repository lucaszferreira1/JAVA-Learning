import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programa {
	private Map<String, List<Pessoa>> pessoas = new HashMap<String, List<Pessoa>>();
	
	
	public Programa() {
		pessoas.put("-1 até 12: Crianças;", 		new ArrayList<Pessoa>());
		pessoas.put("13 até 18: Adolescentes;", new ArrayList<Pessoa>());
		pessoas.put("19 até 25: Jovens;", 		new ArrayList<Pessoa>());
		pessoas.put("26 até 59: Adultos;", 		new ArrayList<Pessoa>());
		pessoas.put("60 ou mais: Idosos;", 		new ArrayList<Pessoa>());
	}

	public Map<String, List<Pessoa>> getPessoas() {
		return pessoas;
	}

	public void setPessoas(Map<String, List<Pessoa>> pessoas) {
		this.pessoas = pessoas;
	}

	public void adicionarPessoa(Pessoa pessoa) {
		if (pessoa.getIdade() < 13) {
			pessoas.get("-1 até 12: Crianças;").add(pessoa);
		}else if(pessoa.getIdade() < 19){
			pessoas.get("13 até 18: Adolescentes;").add(pessoa);
		}else if(pessoa.getIdade() < 26){
			pessoas.get("19 até 25: Jovens;").add(pessoa);
		}else if(pessoa.getIdade() < 61) {
			pessoas.get("26 até 59: Adultos;").add(pessoa);
		}else {
			pessoas.get("60 ou mais: Idosos;").add(pessoa);
		}
	}
}
