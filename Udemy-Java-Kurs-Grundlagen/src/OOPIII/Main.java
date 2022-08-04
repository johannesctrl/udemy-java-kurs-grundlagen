package OOPIII;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reifen goodyear_winter_reifen = new Reifen("Goodyear", "Winterreifen");
		Auto bmw_auto = new Auto("BMW", goodyear_winter_reifen);
		
		Reifen michelin_sommerreifen = new Reifen("Michelin", "Sommerreifen");
		Auto vw_auto = new Auto("VW", michelin_sommerreifen);
		
		bmw_auto.ausgabe_daten();
		vw_auto.ausgabe_daten();
	}

}
