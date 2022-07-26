import java.util.Scanner;

public class BeispielArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fragen = { "Wie viel ist 5 + 6?", "Wie viel ist 7 + 9?" };
		int[] antworten = { 11, 16 };
		for (int i = 0; i < fragen.length; i++) {
			System.out.println(fragen[i]);
			Scanner scanner = new Scanner(System.in);
			int user_input = scanner.nextInt();

			if (user_input == antworten[i]) {
				System.out.println("richtig");
			} else {
				System.out.println("falsch");
			}
		}

	}

}
