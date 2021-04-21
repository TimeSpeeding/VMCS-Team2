
public class Coin {

	private int value;
	private int weight;
	private int quantity;
	
	public Coin(int value, int weight, int quantity) {
		this.value = value;
		this.weight = weight;
		this.quantity = quantity;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
