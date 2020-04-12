package Ringispil;

public class Ringispil extends Voznja{
	
	private int trajanjeVoznje;

	public Ringispil(int trajanjeVoznje) {
		super("Ringispil", 200, 5);
		this.trajanjeVoznje = trajanjeVoznje;
	}

	public int getTrajanjeVoznje() {
		return trajanjeVoznje;
	}
	
	

}

