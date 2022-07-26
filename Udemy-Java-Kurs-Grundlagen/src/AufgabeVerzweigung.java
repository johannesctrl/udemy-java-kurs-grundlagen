import java.util.Scanner;

public class AufgabeVerzweigung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wie viele Bundesländer hat Deutschland?");
		int answer = Integer.parseInt(scanner.next());
		int correct_answer = 16;
		if(answer == correct_answer) {
			System.out.println("Richtig!");
		}else {
			System.out.println("Falsch!");
		}
		scanner.close();
		
		
		
	}

}
