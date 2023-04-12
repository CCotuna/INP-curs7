package Exercitiu5Polimorfism;

public class GreutateSimpla extends Greutate{

	public GreutateSimpla(int capacitate) {
		super(capacitate);
	}

	public int capacitate() {
		return getCapacitate();
	}

	public String toString() {
        return "GreutateSimpla: " + capacitate() + " kg";
    }
}
