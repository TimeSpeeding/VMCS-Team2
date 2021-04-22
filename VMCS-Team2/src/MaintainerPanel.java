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
	
}

public static void start() {
	
	JFrame frame = new JFrame();
	frame.setSize(500,500);

	
	frame.setTitle("maintainer panel");
	JPanel content=new JPanel();
	frame.setContentPane(content);
	
//	content.setLayout(new GridLayout(10,0));
	
	JLabel label = new JLabel("Enter Password");
            content.add(label);
	
    
    
	JTextField Password = new JTextField(5);
	 Password.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String password = Password.getText();
			System.out.println(password);
			passwordStatus=verifyPassword(password);
			
			System.out.println(passwordStatus);		
			JLabel res = new JLabel("");
	          content.add(res); 
	          content.repaint();
			}});
      content.add(Password);
      Password.setColumns(40);
      content.repaint();
      
      
      
     

      
      
//drinkssection
	
	frame.setVisible(true);
	
}
public static String verifyPassword(String Password) {
	
	return(vendingmachineControl.verifyPassword(Password));
}
}
	
	
	
	

