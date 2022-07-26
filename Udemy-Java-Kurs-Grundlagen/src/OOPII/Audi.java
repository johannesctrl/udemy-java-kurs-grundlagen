package OOPII;

public class Audi extends Auto {

	boolean quattro;
	
	public Audi(String fahrzeug_typ, int ps, int tueren, boolean quattro) {
		super("Audi", fahrzeug_typ, ps, tueren);
		this.quattro = quattro;
	}
	
	@Override
	public void starten() {
		super.starten();
		System.out.println("Ja, und zwar ein Audi.");
	}
	
}
