package Exercitiu5Polimorfism;

public abstract class Greutate {
	
	private int capacitate;
	
	public Greutate(int capacitate) {
		this.capacitate = capacitate;
	}
	
	public int getCapacitate() {
		return capacitate;
	}
	
	public abstract int capacitate();
	
	
}
