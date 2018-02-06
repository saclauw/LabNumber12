import java.util.Scanner;

public class HumanPlayer extends Player {
	Scanner scan = new Scanner(System.in);
	String results = " ";
	int wins = 0;
	int losses = 0;
	int ties = 0;
	
	
	public HumanPlayer() {
	}

	public HumanPlayer(String userName) {
		super(userName);
	}

	@Override
	public Roshambo getRoshambo() {
		System.out.print("\nPlease pick (R)ock, (P)aper, or (S)cissors: ");
		char userChoice = scan.next().toUpperCase().charAt(0);
		switch (userChoice) {
		case 'R':
			return Roshambo.ROCK;
		case 'P':
			return Roshambo.PAPER;
		case 'S':
			return Roshambo.SCISSORS;
		default:
			System.out.println("Oops! Try that again.");
			return getRoshambo();
		}

	}
	
	public void stats() {
		if (results.charAt(0) == 'T') {
			ties += ties;
			} else if (results.charAt(0) == 'B') {
				losses += losses;
			} else if (results.charAt(0) == 'W') {
				wins += wins;
			}		
	}
	
	public void displayStats() {
		System.out.println("Total games played: " + (wins + losses + ties));
		System.out.println("Total wins = " + wins);
		System.out.println("Total losses = " + losses);
		System.out.println("Total ties = " + ties);
		
	}
	
	
	
}
