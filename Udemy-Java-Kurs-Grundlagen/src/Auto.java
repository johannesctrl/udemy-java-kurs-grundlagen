
public class Auto {
	int reifen;
	double preis;
	String marke;

	public Auto(int reifen, double preis, String marke) {
		this.reifen = reifen;
		this.preis = preis;
		this.marke = marke;
	}

	public void gas_geben() {
		System.out.println("Das Auto mit der Marke " + marke + " gibt gas.");
	}

}
