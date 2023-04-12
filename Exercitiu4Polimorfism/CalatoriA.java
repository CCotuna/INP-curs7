package Exercitiu4Polimorfism;

public class CalatoriA extends Servicii {

	public CalatoriA(String id) {
		super(id, 40, 300);
	}
	
	public String deschidereUsi() {
		return "Usile vagonului CalatoriA se deschid ... Usi deschise!";
	}
	
	public String inchidereUsi() {
		return "Usile vagonului CalatoriA se inchid ... Usi inchise!";
	}
	
	public String getClasa() {
		return "CalatoriA";
	}
}
