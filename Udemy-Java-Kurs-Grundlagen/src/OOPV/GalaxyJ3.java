package OOPV;

public class GalaxyJ3 extends Samsung implements ITelefon {

	public GalaxyJ3(double preis, String produktTyp) {
		super(preis, produktTyp);
	}
	
	@Override
	public void power_on() {
		// TODO Auto-generated method stub
		System.out
				.println("Das GalaxyJ3 geht an der rechten Seite an und mann muss den Power Button 3 Sekunden halten.");
	}

	@Override
	public boolean es_klingelt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean anrufen() {
		// TODO Auto-generated method stub
		return false;
	}

}
