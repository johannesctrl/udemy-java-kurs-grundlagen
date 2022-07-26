
public class SchleifeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bedingung = true;
		int i = 0;
		while(bedingung) {
			System.out.println("Hallo");
			i++;
			if(i == 5) {
				bedingung = false;
			}
		}
	}

}
