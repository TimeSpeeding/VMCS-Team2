import java.util.Scanner;
public class MaintainerPanel {

public static void main(String [] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Password");
	String x = s.nextLine();
	MainVendingMachineControl y = new MainVendingMachineControl();
	y.verifyPassword(x);
	
	
}
}
	
	
	
	

