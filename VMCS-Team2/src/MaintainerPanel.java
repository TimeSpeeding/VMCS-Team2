import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MaintainerPanel {

	public static String passwordStatus="";
	static MainVendingMachineControl vendingmachineControl= new MainVendingMachineControl();
	
public static void main(String [] args) {
//	Scanner s = new Scanner(System.in);
//	System.out.println("Enter Password");
//	String x = s.nextLine();
//	MainVendingMachineControl y = new MainVendingMachineControl();
//	y.verifyPassword(x);
	
	start();
	display();
	
}

public static void start() {
	
	JFrame frame = new JFrame();
	frame.setSize(500,500);

	
	frame.setTitle("maintainer panel");
	JPanel content=new JPanel();
	frame.setContentPane(content);
	frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
	
	
	JLabel label = new JLabel("Enter Password");
            content.add(label);
	
    
    
	JTextField Password = new JTextField(5);
	 Password.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String password = Password.getText();
			System.out.println(password);
			passwordStatus=verifyPassword(password);
			System.out.println(passwordStatus);		
			JLabel res = new JLabel();
//			res.removeAll();
			res.setText(passwordStatus);
			content.add(res); 
			
	        content.revalidate();
//	        frame.repaint();
			}});
      content.add(Password);
      Password.setColumns(40);
      content.revalidate();
      
     
      
//      content.repaint();
      
      
Drink drink1 = new Drink("pepsi",2,15);
Drink drink2 = new Drink("sevenup",3,25); 
Drink drink3 = new Drink("cocacola",4,25);
//drinkssection
//flowLayout.get
//JLabel DrinkLabel = new JLabel("All Drinks Available");
//content.add(DrinkLabel);
//DrinkLabel;


      
	
	frame.setVisible(true);
	
}
public static String verifyPassword(String Password) {
	
	return(vendingmachineControl.verifyPassword(Password));
}

static Drink drink1 = new Drink("pepsi",2,15);
static Drink drink2 = new Drink("sevenup",3,25); 
static Drink drink3 = new Drink("cocacola",4,25);
public static void display(){
	System.out.println("All Available Drinks:");
	System.out.println(drink1.getBrand() +"    " +drink1.getQuantity()+"    "+drink1.getPrice());
	System.out.println(drink2.getBrand() +"    " +drink2.getQuantity()+"    "+drink2.getPrice());
	System.out.println(drink3.getBrand() +"    " +drink3.getQuantity()+"    "+drink3.getPrice());
	
	setNewPrice();
}

public static void setNewPrice() {
	System.out.println("choose a brand to set price");
	Scanner s = new Scanner(System.in);
	String brand = s.nextLine();
//	vendingmachineControl.setNewPrice(brand, "75");	
	
}
}
	
	
	
	

