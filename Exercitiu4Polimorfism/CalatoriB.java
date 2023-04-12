package Exercitiu4Polimorfism;

public class CalatoriB extends Servicii {

	public CalatoriB(String id) {
		super(id, 50, 400);
	}
	
	public String deschidereUsi() {
		return "Usile vagonului CalatoriB se deschid ... Usi deschise!";
	}
	
	public String inchidereUsi() {
		return "Usile vagonului CalatoriB se inchid ... Usi inchise!";
	}
	
	public  String blocareGeamuri() {
		return "Geamurile vagonului CalatoriB au fost blocate!";
	}
	
	public String getClasa() {
		return "CalatoriB";
	}

}
