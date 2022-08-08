package OOPIV;

public class Main {

	public static void main(String[] args) {
		
		GoogleKonto gk_peter = new GoogleKonto("Peter", "1234");
		gk_peter.setPasswort("betterPassword");
		System.out.println(gk_peter.getPasswort());
		
	}

}
