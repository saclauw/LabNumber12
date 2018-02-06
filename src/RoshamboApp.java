import java.util.Scanner;

public class RoshamboApp {
	public static void main(String[] args) {
		Player opponentPlayer = null;
		String challenger = " ";
		String cont = "y";

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.print("Please enter your name: ");
		String userName = scan.nextLine();
		System.out.print("\nWould you like to play against The Rock (1) or Dwayne Johnson (2): ");
		int playerType = scan.nextInt();
		if (playerType == 1) {
			opponentPlayer = new RockPlayer();
			challenger = "The Rock";
		}
		if (playerType == 2) {
			opponentPlayer = new RandomPlayer();
			challenger = "Dwayne Johnson";
		}

		while (cont.equalsIgnoreCase("y")) {
		
		HumanPlayer humanPlayer = new HumanPlayer();
		humanPlayer.setName(userName);
		
		Player.Roshambo userThrow = humanPlayer.getRoshambo();
		Player.Roshambo opponentThrow = opponentPlayer.getRoshambo();
		
		System.out.println("\n" + userName + " threw: " + userThrow);
		System.out.println(challenger + " threw: " + opponentThrow);
		

		String results = matchResults(userThrow, opponentThrow);

		System.out.println(results);


		HumanPlayer stats = new HumanPlayer();
		stats.stats();

			System.out.print("\nPlay again? (y/n) ");
			cont = scan.next();

			if (!cont.equalsIgnoreCase("y")) {

				System.out.println("\nGoodbye!");
				
			}

		}

		HumanPlayer statsDisplay = new HumanPlayer();	
		statsDisplay.displayStats();
		scan.close();
		
		
		
	}

	public static String matchResults(Player.Roshambo userThrow, Player.Roshambo opponentThrow) {
		if (userThrow == opponentThrow) {
			return "Tie!";
		} else if ((userThrow == Player.Roshambo.ROCK && opponentThrow == Player.Roshambo.PAPER)
				|| (userThrow == Player.Roshambo.SCISSORS && opponentThrow == Player.Roshambo.ROCK)
				|| (userThrow == Player.Roshambo.PAPER && opponentThrow == Player.Roshambo.SCISSORS)) {
			return "Better Luck Next Time!";
		} else if ((userThrow == Player.Roshambo.SCISSORS && opponentThrow == Player.Roshambo.PAPER)
				|| (userThrow == Player.Roshambo.ROCK && opponentThrow == Player.Roshambo.SCISSORS)
				|| (userThrow == Player.Roshambo.PAPER && opponentThrow == Player.Roshambo.ROCK)) {
			return "Winner!";
		}
		return "ERROR!";
	}

}
