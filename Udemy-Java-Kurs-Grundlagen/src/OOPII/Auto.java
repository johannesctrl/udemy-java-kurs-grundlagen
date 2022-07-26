package OOPII;

public class Auto {
	String marke;
	String fahrzeug_typ;
	int ps;
	int tueren;

	public Auto(String marke, String fahrzeug_typ, int ps, int tueren) {
		super();
		this.marke = marke;
		this.fahrzeug_typ = fahrzeug_typ;
		this.ps = ps;
		this.tueren = tueren;
	}

	public void starten() {
		System.out.println("Das Auto startet.");
	}

}
