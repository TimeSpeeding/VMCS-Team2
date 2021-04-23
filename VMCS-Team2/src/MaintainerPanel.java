import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MaintainerPanel {

	public static String passwordStatus="";
	static private ArrayList<Drink> ds = MainVendingMachineControl.drinks;
	static MainVendingMachineControl vendingmachineControl= new MainVendingMachineControl();
	
	static JButton drink1=new JButton("Coca-Cola");
	static JButton drink2=new JButton("Fanta");
	static JButton drink3=new JButton("Sarsi");
	static JButton drink4=new JButton("Soya Bean");
	static JButton drink5=new JButton("Coca-Cola");
	
	static JLabel Quantity1=new JLabel();
	
public static void display() {
	
	JFrame frame = new JFrame();
	frame.setSize(500,600);

	
	frame.setTitle("maintainer panel");
	JPanel content=new JPanel();
	frame.add(content);
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
    Password.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String password = Password.getText();
			passwordStatus=verifyPassword(password);
			System.out.println(passwordStatus);		
			res.setVisible(true);
			res.setText(passwordStatus);
			content.revalidate();
}});
      content.add(Password);
      content.revalidate();

//drinkssection

JLabel DrinkLabel = new JLabel("All Available Drinks, click to view Quantity and Price");
DrinkLabel.setBounds(50, 100, 300, 20);
content.add(DrinkLabel);
content.revalidate();

drink1.setBounds(0, 120, 100, 30);
drink2.setBounds(90, 120, 100, 30);
drink3.setBounds(190, 120, 100, 30);
drink4.setBounds(290, 120, 100, 30);
drink5.setBounds(390, 120, 100, 30);

Quantity1.setBounds(200, 160, 100, 15);
Quantity1.setVisible(false);
content.add(Quantity1);

JLabel SetPriceLabel = new JLabel("Set Price:");
SetPriceLabel.setBounds(10, 160, 150, 20);
SetPriceLabel.setVisible(false);
content.add(SetPriceLabel);
content.revalidate();

JTextField SetPrice1 = new JTextField(2);
SetPrice1.setBounds(20, 190, 50, 20);
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
JTextField SetPrice5 = new JTextField(2);
SetPrice5.setBounds(400, 190, 50, 20);
content.add(SetPrice5);

JLabel SuccessLabel = new JLabel();
SuccessLabel.setBounds(50, 220, 200, 20);
content.add(SuccessLabel);
SuccessLabel.setVisible(false);

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
		    				String Success=setNewPrice(drink1.getText(),SetPrice1.getText());
		    				SuccessLabel.setText(Success);
		    				SuccessLabel.setVisible(true);
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
    				 String Success=setNewPrice(drink2.getText(),SetPrice2.getText());
    				 SuccessLabel.setText(Success);
	    			 SuccessLabel.setVisible(true);
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
    				 String Success=setNewPrice(drink3.getText(),SetPrice3.getText());
    				 SuccessLabel.setText(Success);
	    			 SuccessLabel.setVisible(true);
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
    				 String Success= setNewPrice(drink4.getText(),SetPrice4.getText());
    				 SuccessLabel.setText(Success);
	    			 SuccessLabel.setVisible(true);
    			 }
    		 });
		    	 }
	});
drink5.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Integer Quantity;
		Integer Price;
		Price=getDrinksPrice(drink5.getText());
		Quantity=getDrinksQuantity(drink5.getText());
		    	 Quantity1.setText(Integer.toString(Quantity));
		    	 Quantity1.setVisible(true);
		    	 content.revalidate();
		    	 SetPriceLabel.setVisible(true);
		    	 content.revalidate();
		    	 SetPrice5.setText(Integer.toString(Price));
		    	 SetPrice5.setVisible(true);
		    	 SetPrice5.addActionListener(new ActionListener()
		    			 { public void actionPerformed(ActionEvent ae) {
		    				String Success=setNewPrice(drink5.getText(),SetPrice5 .getText());
		    				SuccessLabel.setText(Success);
		    				SuccessLabel.setVisible(true);
		    			 }
		    		 });
		    	 }
	});

content.add(drink1);
content.add(drink2);
content.add(drink3);
content.add(drink4);
content.add(drink5);

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

public static String setNewPrice(String brand,String price) {
	return vendingmachineControl.setNewPrice(brand, price);	
	
}
}
	
	
	
	

