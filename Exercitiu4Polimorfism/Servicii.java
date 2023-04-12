package Exercitiu4Polimorfism;

public abstract class Servicii extends Vagon {
	
	public Servicii(String id, int capacitate, int colete) {
		super(id, capacitate, colete);
	}
	public abstract String deschidereUsi();
	public abstract String inchidereUsi();
}
