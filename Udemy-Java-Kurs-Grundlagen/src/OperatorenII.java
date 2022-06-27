
public class OperatorenII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int leben_gegner = 0;
		boolean hit = true;
		
		int a = 3;
		int b = 3;
		boolean c;
		
		c = a == b;
		System.out.println("c is " + c);
		
		if (leben_gegner == 0 && hit) {
			System.out.println("Gegner zerstört");
		} else {
			System.out.println("Gegner hat noch " + leben_gegner + " Lebenspunkte.");
		}
	}

}
