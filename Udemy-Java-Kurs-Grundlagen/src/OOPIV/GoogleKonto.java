package OOPIV;

import java.util.Scanner;

public class GoogleKonto {

	private String name;
	private String passwort;
	
	public GoogleKonto(String name, String passwort) {
		this.name = name;
		this.passwort = passwort;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		if(passwort.equals(this.passwort)) {
			Scanner scanner = new Scanner(System.in);
			String new_password = scanner.next();
			this.passwort = new_password;
			System.out.println("Password changed.");
		} else {
			System.out.println("Incorrect password.");
		}
		
	}
	
	
	
}
