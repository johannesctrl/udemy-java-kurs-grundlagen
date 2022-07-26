package OOPII;

public class BMW extends Auto {
	
	boolean xDrive;
	
	public BMW(String fahrzeug_typ, int ps, int tueren, boolean xDrive) {
		super("BMW", fahrzeug_typ, ps, tueren);
		this.xDrive = xDrive;
	}
	
	@Override
	public void starten() {
		super.starten();
		System.out.println("Nämlich der BMW startet.");
	}

}
