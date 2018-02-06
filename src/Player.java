public abstract class Player {
	private String userName;

	public enum Roshambo {ROCK, PAPER, SCISSORS};

	public Player() {

	}

	public Player(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return userName;
	}

	public void setName(String userName) {
		this.userName = userName;
	}

	public abstract Roshambo getRoshambo();

}
