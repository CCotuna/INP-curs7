package Exercitiu5Polimorfism;

import java.util.ArrayList;
import java.util.List;

public class GreutateMultipla extends Greutate{

	private List<Greutate> listaGreutati;
	
	public GreutateMultipla() {
		super(0);
		listaGreutati = new ArrayList<Greutate>();
	}
	
	public void adaugaGreutate(Greutate g) {
		listaGreutati.add(g);
	}
	
	public int capacitate() {
		int capacitateTotala = 0;
		for(Greutate g : listaGreutati) {
			capacitateTotala += g.capacitate();
		}
		return capacitateTotala;
	}
	
	public String toString() {
        return "GreutateMultipla: " + capacitate() + " kg";
    }
}
