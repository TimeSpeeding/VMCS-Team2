import java.util.ArrayList;
import java.util.Iterator;
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
	public static ArrayList<String> brands = new ArrayList<String>();
	public static ArrayList<Drink> drinksData = new ArrayList<Drink>();
	static MainVendingMachineControl vendingmachineControl= new MainVendingMachineControl();
	
	static JButton drink1=new JButton("Coca-Cola");
	static JButton drink2=new JButton("Fanta");
	static JButton drink3=new JButton("Sarsi");
	static JButton drink4=new JButton("Soya Bean");
	
	static JLabel Quantity1=new JLabel();
	static JLabel Quantity2=new JLabel();
	static JLabel Quantity3=new JLabel();
	static JLabel Quantity4=new JLabel();
//	static JButton drink5=new JButton("");
	
public static void main(String [] args) {
	start();

}

public static void start() {
	
	JFrame frame = new JFrame();
	frame.setSize(600,600);

	
	frame.setTitle("maintainer panel");
	JPanel content=new JPanel();
	frame.add(content);
//	frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
	content.setLayout(null);
	
	
	JLabel label = new JLabel("Enter Password");
	label.setBounds(50,0,300,50);
    content.add(label);
	
    JLabel res = new JLabel();
	res.setBounds(50,60,100,30);
	content.add(res); 
	res.setVisible(false);
    
    
	JTextField Password = new JTextField(5);
	Password.setBounds(50,40,100,30);
//	content.revalidate();
	 Password.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String password = Password.getText();
			System.out.println(password);
			passwordStatus=verifyPassword(password);
			System.out.println(passwordStatus);		
			res.setVisible(true);
			res.setText(passwordStatus);
			content.revalidate();
}});
      content.add(Password);
      content.revalidate();

//drinkssection

JLabel DrinkLabel = new JLabel("All Drinks Available");
DrinkLabel.setBounds(50, 100, 200, 20);
content.add(DrinkLabel);
content.revalidate();



drink1.setBounds(10, 120, 100, 20);
drink2.setBounds(100, 120, 100, 20);
drink3.setBounds(200, 120, 100, 20);
drink4.setBounds(300, 120, 100, 20);

Quantity1.setBounds(200, 150, 100, 15);
Quantity1.setVisible(false);
content.add(Quantity1);

JLabel SetPriceLabel = new JLabel("Set Price:");
SetPriceLabel.setBounds(10, 160, 150, 20);
SetPriceLabel.setVisible(false);
content.add(SetPriceLabel);
content.revalidate();

JTextField SetPrice1 = new JTextField(2);
SetPrice1.setBounds(30, 190, 50, 20);
content.add(SetPrice1);
JTextField SetPrice2 = new JTextField(2);
SetPrice2.setBounds(120, 190, 50, 20);
content.add(SetPrice2);
JTextField SetPrice3 = new JTextField(2);
SetPrice3.setBounds(230, 190, 50, 20);
content.add(SetPrice3);
JTextField SetPrice4 = new JTextField(2);
SetPrice4.setBounds(320, 190, 50, 20);

content.add(SetPrice4);

drink1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Integer Quantity;
		Integer Price;
		Price=getDrinksPrice(drink1.getText());
		Quantity=getDrinksQuantity(drink1.getText());
		    	 Quantity1.setText(Integer.toString(Quantity));
		    	 Quantity1.setVisible(true);
		    	 content.revalidate();
		    	 SetPriceLabel.setVisible(true);
		    	 content.revalidate();
		    	 SetPrice1.setText(Integer.toString(Price));
		    	 SetPrice1.setVisible(true);
		    	 SetPrice1.addActionListener(new ActionListener()
		    			 { public void actionPerformed(ActionEvent ae) {
		    				setNewPrice(drink1.getText(),SetPrice1.getText());
		    			 }
		    		 });
		    	 }
	});
drink2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Integer Quantity;
		Integer Price;
		Price=getDrinksPrice(drink2.getText());
		Quantity=getDrinksQuantity(drink2.getText());
		    	 Quantity1.setText(Integer.toString(Quantity));
		    	 Quantity1.setVisible(true);
		    	 content.revalidate();
		    	 SetPriceLabel.setVisible(true);
		    	 content.revalidate();
		    	 SetPrice2.setText(Integer.toString(Price));
		    	 SetPrice2.setVisible(true);
		    	 SetPrice2.addActionListener(new ActionListener()
    			 { public void actionPerformed(ActionEvent ae) {
    				setNewPrice(drink2.getText(),SetPrice2.getText());
    			 }
    		 });
		    	 }
	});
drink3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Integer Quantity;
		Integer Price;
		Price=getDrinksPrice(drink3.getText());
		Quantity=getDrinksQuantity(drink3.getText());
		    	 Quantity1.setText(Integer.toString(Quantity));
		    	 Quantity1.setVisible(true);
		    	 content.revalidate();
		    	 SetPriceLabel.setVisible(true);
		    	 content.revalidate();
		    	 SetPrice3.setText(Integer.toString(Price));
		    	 SetPrice3.setVisible(true);
		    	 SetPrice3.addActionListener(new ActionListener()
    			 { public void actionPerformed(ActionEvent ae) {
    				setNewPrice(drink3.getText(),SetPrice3.getText());
    			 }
    		 });
		    	 }
	});
drink4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Integer Quantity;
		Integer Price;
		Price=getDrinksPrice(drink4.getText());
		Quantity=getDrinksQuantity(drink4.getText());
		    	 Quantity1.setText(Integer.toString(Quantity));
		    	 Quantity1.setVisible(true);
		    	 content.revalidate();
		    	 SetPriceLabel.setVisible(true);
		    	 content.revalidate();
		    	 SetPrice4.setText(Integer.toString(Price));
		    	 SetPrice4.setVisible(true);
		    	 SetPrice4.addActionListener(new ActionListener()
    			 { public void actionPerformed(ActionEvent ae) {
    				setNewPrice(drink4.getText(),SetPrice4.getText());
    			 }
    		 });
		    	 }
	});


content.add(drink1);
content.add(drink2);
content.add(drink3);
content.add(drink4);

//display();
 frame.setVisible(true);
	
}
public static String verifyPassword(String Password) {
	
	return(vendingmachineControl.verifyPassword(Password));
}



public static Integer getDrinksQuantity(String brand) {
	return vendingmachineControl.getdrinksQuantity(brand);
	
}

public static Integer getDrinksPrice(String brand) {
	return vendingmachineControl.getdrinksPrice(brand);
	
}

public static void setNewPrice(String brand,String price) {
	vendingmachineControl.setNewPrice(brand, price);	
	
}
}
	
	
	
	

