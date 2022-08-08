package OOPV;

public interface ITelefon {
	
	public static final String NETZANBIETER = "Telekom";
	
	public abstract void power_on();
	public abstract boolean es_klingelt();
	public abstract boolean anrufen();
	
}
