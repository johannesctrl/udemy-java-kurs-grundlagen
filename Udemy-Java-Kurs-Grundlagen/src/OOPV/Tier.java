package OOPV;

public abstract class Tier {
	String name;
	int groe�e;
	int gewicht;

	public Tier() {

	}

	public Tier(String name, int gewicht, int groe�e) {
		this.name = name;
		this.gewicht = gewicht;
		this.groe�e = groe�e;
	}

	public abstract void essen();
	public abstract void atmen();
	
}
