package OOPII;

public class Tier {
	String name;
	int groe�e;
	int gewicht;
	
	public Tier(String name, int gewicht, int groe�e) {
		this.name = name;
		this.gewicht = gewicht;
		this.groe�e = groe�e;
	}
	
	public void essen(String animal_name) {
		System.out.println(animal_name + " isst.");
	}

}
