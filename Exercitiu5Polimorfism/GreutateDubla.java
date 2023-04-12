package Exercitiu5Polimorfism;

public class GreutateDubla extends Greutate{

	private Greutate g1;
	private Greutate g2;
	
	public GreutateDubla(Greutate g1, Greutate g2) {
		super(0);
		this.g1 = g1;
		this.g2 = g2;
	}
	
	public void setGreutate1(Greutate g1) {
		this.g1 = g1;
	}
	
	public void setGreutate2(Greutate g2) {
		this.g2 = g2;
	}
	
	public int capacitate() {
		return g1.capacitate() + g2.capacitate();
	}
	
	public String toString() {
        return "GreutateDubla: " + capacitate() + " kg";
    }
}
