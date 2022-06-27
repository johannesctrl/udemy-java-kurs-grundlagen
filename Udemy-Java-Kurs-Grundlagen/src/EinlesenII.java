import java.util.Scanner;

public class EinlesenII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// age
		System.out.println("Alter eingeben...");
		int age = scanner.nextInt();
		System.out.println("Alter lautet " + age);
		
		// name
		System.out.println("Namen eingeben...");
		String name = scanner.next();
		System.out.println("Name lautet " + name);
		scanner.close();
		String test = "test";
	}

}
