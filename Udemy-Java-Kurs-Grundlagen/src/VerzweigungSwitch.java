import java.util.Scanner;

public class VerzweigungSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		switch(5) {
//		case 0:
//			System.out.println("Die Zahl ist eine 0");
//			break;
//		case 3:
//			System.out.println("Die Zahl ist eine 3");
//			break;
//		case 5:
//			System.out.println("Die Zahl ist eine 5");
//			break;
//		}
		
		System.out.println("Wie viele Bundesländer hat Deutschland?");
		System.out.println("16 oder 3 oder 30 oder 15?");
		Scanner scanner = new Scanner(System.in);
		
		int user_input = scanner.nextInt();
		switch(user_input) {
		case 15:
			System.out.println("Falsch");
			break;
		case 16:
			System.out.println("Richtig!");
			break;
		default:
			System.out.println("Zahl ist unbekannt!");
		}

	}
}