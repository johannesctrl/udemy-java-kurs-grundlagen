package OOPII;

public class Tier {
	String name;
	int groeﬂe;
	int gewicht;
	
	public Tier(String name, int gewicht, int groeﬂe) {
		this.name = name;
		this.gewicht = gewicht;
		this.groeﬂe = groeﬂe;
	}
	
	public void essen(String animal_name) {
		System.out.println(animal_name + " isst.");
	}

}
