import java.util.ArrayList;

public class CoinsMemento {
	private ArrayList<Coin> coins;

	public ArrayList<Coin> getCoins() {
		return coins;
	}

	public void setCoins(ArrayList<Coin> coins) {
		this.coins = coins;
	}

	public CoinsMemento(ArrayList<Coin> coins) {
		this.coins = coins;
	}
}
