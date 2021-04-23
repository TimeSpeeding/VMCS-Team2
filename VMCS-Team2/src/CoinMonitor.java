
public class CoinMonitor {

	public static int verifyCoin(double weight) {
		for (Coin c : MainVendingMachineControl.coins) {
			if (c.getWeight() == weight) {
				return c.getValue();
			}
		}
		return 0;
	}
	
}
