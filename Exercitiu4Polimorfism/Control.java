package Exercitiu4Polimorfism;

public class Control {

	public static void main(String[] args) {
		Tren tren1 = new Tren("ID t1 - tren");
		
		Vagon vA1 = new CalatoriA("ID1 -Calatori A");
		Vagon vB1 = new CalatoriB("ID2 -Calatori B");
		Vagon vM1 = new Marfa("ID3 - Marfa");
		
		tren1.adaugaVagon(vA1);
		tren1.adaugaVagon(vB1);
		tren1.adaugaVagon(vM1);
		
		System.out.println(vA1.deschidereUsi());
		System.out.println(vA1.inchidereUsi() + "\n");
		System.out.println(vB1.deschidereUsi());
		System.out.println(vB1.inchidereUsi() + "\n");
		System.out.println(((CalatoriB) vB1).blocareGeamuri() + "\n");
		
		tren1.afisareTren();
		System.out.println();
		
		Tren tren2 = new Tren("ID t2 - tren");
		
		Vagon vA2 = new CalatoriA("ID4 -Calatori A");
		Vagon vB2 = new CalatoriB("ID5 -Calatori B");
		Vagon vM2 = new Marfa("ID6 - Marfa");
		
		tren2.adaugaVagon(vA2);
		tren2.adaugaVagon(vB2);
		tren2.adaugaVagon(vM2);
		
		System.out.println(vA2.deschidereUsi());
		System.out.println(vA2.inchidereUsi() + "\n");
		System.out.println(vB2.deschidereUsi());
		System.out.println(vB2.inchidereUsi() + "\n");
		System.out.println(((CalatoriB) vB2).blocareGeamuri() + "\n");
		
		tren2.afisareTren();
		System.out.println();
		
		System.out.println("Cele 2 trenuri sunt egale. Adevarat - true/ Fals - false");
		System.out.println("Raspuns: "+ tren1.equals(tren2));
		tren1.tipVagon();
	}

}
