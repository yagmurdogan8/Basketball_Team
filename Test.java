
public class Test {
	
	// Do not change anything in this class
	
	public static void main(String[] args) {
		
		int score = 0;
		
		Team t1 = new BasketballTeam("Bulls", 1966);
		Team t2 = new BasketballTeam("Lakers", 1946);
		Team t3 = new BasketballTeam("Celtics", 1946);
		
		BasketballPlayer b1 = new BasketballPlayer("Tim", 134, 205, t1, "Bigman");
		BasketballPlayer b2 = new BasketballPlayer("John", 109, 197, t1, "Guard");
		BasketballPlayer b3 = new BasketballPlayer("Kevin", 100, 189, t2, "Guard");
		BasketballPlayer b4 = new BasketballPlayer("Richard", 93, 185, t3, "Cornerman");
		BasketballPlayer b5 = new BasketballPlayer("Karl", 117, 197, t3, "Guard");
		BasketballPlayer b6 = new BasketballPlayer("David", 120, 200, t3, "Bigman");
		
		if (BasketballPlayer.getNumber() == 6) {
			score += 10;
		}
		if (BasketballTeam.getNumber() == 3) {
			score += 10;
		}
		if (b2.equals(b5)) {
			score += 20;
		}
		if (b3.toString().equals("Kevin/Lakers-H:189-W:100")) {
			score += 15;
		}
		if (t1.equals(t1)) {
			score += 20;
		}
		if (t1.toString().equals("Bulls@1966")) {
			score += 15;
		}
		if (b6.calculateBMI() == 30.0) {
			score += 10;
		}
				
		System.out.println("your grade is " + score);
		
	}
	
}
