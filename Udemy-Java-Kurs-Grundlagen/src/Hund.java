
public class Hund {
	
	int alter;
	String name;
	String rasse;
	
	public Hund(int alter, String name, String rasse) {
		this.alter = alter;
		this.name = name;
		this.rasse = rasse;
	}
	
	public void bellen() {
		System.out.println("Wuff, wuff!");
	}
}
