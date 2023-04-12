package Exercitiu5Polimorfism;

public class MainColectie {

	public static void main(String[] args) {
		ColectieGreutati colectie = new ColectieGreutati(10);
		
		Greutate g = new GreutateSimpla(10);
		Greutate g2 = new GreutateSimpla(10);
		colectie.adauga(g);
		colectie.adauga(g2);
		
		
		Greutate g3 = new GreutateDubla(g, g2);
		colectie.adauga(g3);
		
		
		GreutateMultipla g4 = new GreutateMultipla();
		g4.adaugaGreutate(g);
		g4.adaugaGreutate(g3);
		g4.adaugaGreutate(g2);
		
		colectie.adauga(g4);
		
		colectie.afisareGreutati();
	}

}
