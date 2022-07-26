
public class VerzweigungIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		if(i==1) {
			System.out.println("Zahl in i ist: " + i);
		}else if(i < 1) {
			System.out.println("Zahl in i ist: " + i);
		}else if (i > 1) {
			System.out.println("Zahl in i ist: " + i);
		}else {
			System.out.println("Zahl ist unbekannt.");
		}
		
		int score = 0;
		int lifes_player = 0;
		if (score == 1000) {
			System.out.println("Du hast 1 Stern von 3 Sternen erhalten");
		}else if(score == 5000) {
			System.out.println("Du hast 2 Sterne von 3 Sternen erhalten");
		}else if (score > 5000) {
			System.out.println("Du hast 3 von 3 Sternen erhalten");
			lifes_player += 1;
			System.out.println("Deine Leben betragen: " + lifes_player);
		}
	}

}
