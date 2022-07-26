import java.util.Scanner;

public class BeispielArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lotto_zahlen = new int[6];

		System.out.println("Gib die Lottozahlen an...");
		for (int i = 0; i < lotto_zahlen.length; i++) {
			Scanner scan = new Scanner(System.in);
			int zahl_user = scan.nextInt();
			lotto_zahlen[i] = zahl_user;
		}

		System.out.println("Du hast die folgenden Lottozahlen angegeben...");
		for (int i = 0; i < lotto_zahlen.length; i++) {
			System.out.print(lotto_zahlen[i]);
			if (i != lotto_zahlen.length - 1) {
				System.out.print(",");
			}
		}

	}

}
