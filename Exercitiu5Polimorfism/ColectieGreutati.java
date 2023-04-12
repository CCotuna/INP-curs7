package Exercitiu5Polimorfism;

public class ColectieGreutati {
	
	private Greutate[] greutati;
	private int nrMaxGreutati, capacitateMax;
	
	public ColectieGreutati(int capacitateMax) {
		this.capacitateMax  = capacitateMax;
		this.nrMaxGreutati = 0;
		greutati = new Greutate[capacitateMax];
	}
	
	public void adauga(Greutate g) {
		if(nrMaxGreutati < capacitateMax) {
			greutati[nrMaxGreutati++] = g;
		}
		else
			System.out.println("Greutatea nu poate fi adaugata");
	}
	
	public void afisareGreutati() {
		for(int i = 0 ;i < nrMaxGreutati; i++) {
			System.out.println(greutati[i].toString());
		}
	}
	
	public double medie() {
		int greutate = 0;
		for(int i = 0; i < nrMaxGreutati; i++) {
			greutate += greutati[i].capacitate();
		}
		return (double) greutate/nrMaxGreutati; 
	}
}
