package OOPV;

public class GalaxyS5 extends Samsung implements ITelefon {

	private String farbe;

	@Override
	public void power_on() {
		
	}

	@Override
	public boolean es_klingelt() {
		return false;
	}

	@Override
	public boolean anrufen() {
		return false;
	}

}
