package OOPV;

public class Hund extends Tier{
	
	static String animal_name = "Hund";
	
	public Hund(String name, int gewicht, int groe�e) {
		super(name, gewicht, groe�e);
	}

	@Override
	public void essen() {
		System.out.println(Hund.animal_name + " kaut.");
	}

	@Override
	public void atmen() {
		// TODO Auto-generated method stub
		
	}
}
