import java.util.Scanner;

public class EinlesenI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gebe eine Zahl ein:");
		double zahl = scanner.nextDouble();
		System.out.println("Deine Zahl lautet " + zahl);
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Namen eingeben:");
		String nameString = scanner2.next();
		System.out.println("Alter eingeben:");
		int alter = scanner2.nextInt();
		System.out.println(alter);
		
	}

}
