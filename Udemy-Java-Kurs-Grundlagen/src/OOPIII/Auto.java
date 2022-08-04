package OOPIII;

public class Auto {
	
	String auto_marke;
	Reifen reifen;
	
	public Auto() {
		
	}
	
	public Auto(String auto_marke, Reifen reifen) {
		this.auto_marke = auto_marke;
		this.reifen = reifen;
	}
	
	public void ausgabe_daten() {
		System.out.println("Die Automarke ist: " + this.auto_marke + " und der Reifentyp ist: " + this.reifen.typ);
	}
	
}
