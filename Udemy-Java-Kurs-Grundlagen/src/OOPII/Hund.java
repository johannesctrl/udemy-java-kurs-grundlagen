package OOPII;

public class Hund extends Tier{
	
	static String animal_name = "Hund";
	
	public Hund(String name, int gewicht, int groe�e) {
		super(name, gewicht, groe�e);
	}

	public void essen() {
		System.out.println(Hund.animal_name + " kaut.");
		super.essen(Hund.animal_name);
	}
}
