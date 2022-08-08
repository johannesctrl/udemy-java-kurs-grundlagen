package OOPIV;

public class Held {
	
	public String name;
	private int lebenspunkte;
	
	public Held(int lebenspunkte) {
		if (lebenspunkte > 0 && lebenspunkte <= 100) {
			this.lebenspunkte = lebenspunkte;
		} else {
			
		}
	}
	
	
}
