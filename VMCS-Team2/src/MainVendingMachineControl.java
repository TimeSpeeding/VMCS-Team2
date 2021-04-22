public class MainVendingMachineControl {
	public static String savedPassword="1234";
	public String verifyPassword(String password) {
		if (password.equals(savedPassword)){
			return "Valid Pass";
		}
		else {
			return "Invalid";
		}
	
	
	}
}

