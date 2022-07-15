

public class BasketballPlayer extends Player {

	protected Team team;
	protected String position;

	// Do not change anything in this method
	public static int getNumber() {
		return number;
	}

	// Fill in the blanks. Do not forget to use the keyword "super"
	public BasketballPlayer(String name, int weight, int height, Team team,
						String position) {

	}

	// Erase the content. Fill in the blanks. If heights and positions are equal, it returns true
	@Override
	public boolean equals(Object obj) {


				return false;
		}

	// Erase the content.
	// Fill in the blanks. Format: [name]/[teamName]-H:[height]-W:[weight]
	// For example: Jim/Spurs-H:202-W:112
	@Override
	public String toString() {

		return "";

	}

	// Erase the content. Fill in the blanks. It calculates body mass index.
	public double calculateBMI() {

		return 0;
	}
}
