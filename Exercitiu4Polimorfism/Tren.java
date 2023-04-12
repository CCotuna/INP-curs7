package Exercitiu4Polimorfism;

public class Tren {

	private String id;
	private Vagon[] tren;
	private int nrVagoane;
	
	public Tren(String id) {
		this.tren = new Vagon[15];
		this.nrVagoane = 0;
	}

	public void adaugaVagon(Vagon v) {
		if(this.nrVagoane < 15) {
			tren[nrVagoane] = v;
			nrVagoane++;
		}
		else
			System.out.println("Ai atins numarul maxim de vagoane!");
	}
	
	public void afisareTren() {
		System.out.println("Trenul contine "+ nrVagoane + " vagoane");
		for(int i=0; i<nrVagoane; i++) {
			System.out.println(tren[i].getId() + "   " + tren[i].getColete() + "   " + tren[i].getCapacitate());
		}
	}
	
	public int getNrVagoane() {
		return nrVagoane;
	}
	
	public Vagon getVagon(int index) {
		if(index >=0  && index < nrVagoane) {
			return tren[index];
		}
		else
			return null;
	}

	public boolean equals(Tren tren2) {
		int cT1 = 0, cT2 = 0;
		
		for(int i=0; i< nrVagoane; i++) {
//			System.out.println(this.tren[i].getColete());
			cT1 += this.tren[i].getColete();
		}
		
		for(int i=0; i < tren2.getNrVagoane(); i++) {
//			System.out.println(tren2.getVagon(i).getColete());
			cT2 += tren2.getVagon(i).getColete();
		}
		return cT1 == cT2;
	}
	
	public void tipVagon() {
		for(int i=0; i<nrVagoane; i++) {
			System.out.println("- " + tren[i].getClasa());
		}
	}
}
