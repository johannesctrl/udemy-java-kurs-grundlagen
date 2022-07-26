import java.util.Scanner;

public class UnterschiedForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Asteroid Nr. " + i);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 = leicht; 2 = mittel");
		
		int user_input = scanner.nextInt();
		while(user_input != 10) {
			
		}
		
	}

}
