
public class Laptop {
	
	int ram;
	float preis;
	String marke;
	
	public Laptop(int ram, float preis, String marke) {
		this.ram = ram;
		this.preis = preis;
		this.marke = marke;
	}
	
	public void toString2() {
		System.out.println(ram + " " + preis + " " + marke);
	}
	
}
