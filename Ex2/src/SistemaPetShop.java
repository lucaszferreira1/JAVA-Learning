import java.util.Scanner;

public class SistemaPetShop {
	public Veterinario[] vets = new Veterinario [50];
	public int numVets = 0;
	Scanner scanner = new Scanner(System.in);
	public int getNumVets() {
		return numVets;
	}
	public Veterinario[] getVets() {
		return vets;
	}
	public void setVet(Veterinario p) {
		if (numVets < 50) {
			vets[this.numVets] = p; 
			this.numVets++;
		}
	}
	public void setNumVets(int numVets) {
		this.numVets = numVets;
	}
	public void setVets(Veterinario[] vets) {
		this.vets = vets;
	}
}