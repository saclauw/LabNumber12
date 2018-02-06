import java.util.Random;

public class RandomPlayer extends Player {
	private Random random;

	public RandomPlayer() {
		super();
		random = new Random();
	}

	@Override
	public Roshambo getRoshambo() {
		int choice = 1 + random.nextInt(3);

		switch (choice) {
		case 1:
			return Roshambo.ROCK;
		case 2:
			return Roshambo.PAPER;
		default:
			return Roshambo.SCISSORS;

		}
	}
}
