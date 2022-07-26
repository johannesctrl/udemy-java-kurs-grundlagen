package OOPII;

public class MacBook extends Laptop {

	boolean touch_bar;

	public MacBook(String marke, int ram, String cpu, double preis, boolean touch_bar) {
		super(marke, ram, cpu, preis);
		this.touch_bar = touch_bar;
	}

	@Override
	public void starten() {
		System.out.println("Macbook startet");
	}

}
