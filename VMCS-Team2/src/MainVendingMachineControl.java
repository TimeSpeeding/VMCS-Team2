public class MainVendingMachineControl {
	public static String savedPassword="1234";
	public void verifyPassword(String password) {
		if (password.equals(savedPassword)){
			System.out.println("Valid Pass");
		}
		else {
			System.out.println("Invalid");
		}
	
	
	}
}

