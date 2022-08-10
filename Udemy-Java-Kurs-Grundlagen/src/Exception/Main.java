package Exception;

import java.util.Scanner;

import beispielpaket.NichtDurchNullTeilenException;
import beispielpaket.Taschenrechner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {
			int i1 = scanner.nextInt();
			int i2 = scanner.nextInt();
			Taschenrechner.dividiere(i1, i2);
		} catch (NichtDurchNullTeilenException e) {
			System.out.println(e.getMessage());
		}

	}

}
