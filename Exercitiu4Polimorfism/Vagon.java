package Exercitiu4Polimorfism;

public abstract class Vagon {
	private String id;
	private int capacitate, colete;
	
	public Vagon(String id, int capacitate, int colete) {
		this.id = id;
		this.capacitate = capacitate;
		this.colete = colete;
	}
	
	public String getId() {
		return id;
	}

	public int getCapacitate() {
		return capacitate;
	}

	public int getColete() {
		return colete;
	}
	
	public String deschidereUsi() {
		return "Usile se deschid ... Usi deschise!";
	}
	
	public String inchidereUsi() {
		return "Usile se inchid ... Usi inchise!";
	}

	public abstract String getClasa();
}
