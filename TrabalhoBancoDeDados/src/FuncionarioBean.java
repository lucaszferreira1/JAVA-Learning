import java.util.HashSet;
import java.util.Iterator;


public class FuncionarioBean {
   private int id;
   private String nome;    
   private String trabalho;
   private String email;
   private String fone;
   private long cpf;
   private BarcoBean barco;

   public FuncionarioBean(int id, String nome, String trabalho, String email, String fone, long cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.trabalho = trabalho;
		this.email = email;
		this.fone = fone;
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTrabalho() {
		return trabalho;
	}
	
	public void setTrabalho(String trabalho) {
		this.trabalho = trabalho;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	public long getCpf() {
		return cpf;
	}
	
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public BarcoBean getBarco() {
		return barco;
	}

	public void setBarco(BarcoBean barco) {
		this.barco = barco;
	}

	@Override
	public String toString() {
		return id + " - " + nome + ", Trabalho: " + trabalho + ", Email: " + email + ", Fone: "
				+ fone + ", CPF: " + cpf;
	}
   
}
