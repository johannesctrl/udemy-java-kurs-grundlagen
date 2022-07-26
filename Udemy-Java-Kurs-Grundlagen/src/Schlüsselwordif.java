
public class Schlüsselwordif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 4000;
		
		if (score == 5000) {
			System.out.println("Herzlichen Glückwunsch! Neuer Rekord!");
		} else {
			System.out.println("Schade, dein Score reicht leider nicht :(");
		}
		
		int lifes_player = 3;
		
		if (lifes_player == 0) {
			System.out.println("Du hast keine Leben mehr.");
		}
		
		boolean enemy_hit = true;
		int highscore = 0;
		
		if (enemy_hit == true) {
			System.out.println("Gegner getroffen.");
			highscore += 10;
		}
	}

}
