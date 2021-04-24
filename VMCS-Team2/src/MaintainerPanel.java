import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaintainerPanel {

	public String passwordStatus="";
	 private ArrayList<Drink> ds = MainVendingMachineControl.drinks;
	 private ArrayList<Coin> cs = MainVendingMachineControl.coins;
	 static MainVendingMachineControl vendingmachineControl= new MainVendingMachineControl();
	
	 JButton drink1=new JButton(ds.get(0).getBrand());
	 JButton drink2=new JButton(ds.get(1).getBrand());
	 JButton drink3=new JButton(ds.get(2).getBrand());
	 JButton drink4=new JButton(ds.get(3).getBrand());
	 JButton drink5=new JButton(ds.get(4).getBrand());
	 
	 
	 
	 static JButton coin1 = new JButton("5");
	 static JButton coin2 = new JButton("10");
	 static JButton coin3 = new JButton("20");
	 static JButton coin4 = new JButton("50");
	 static JButton coin5 = new JButton("100");
	 static JButton cointotal = new JButton("Coin Total(Cents)");
	 static JButton reset = new JButton("Coin Collect");
	 
	 static JLabel CoinQuantity1=new JLabel();
	 static JLabel CoinQuantity2=new JLabel();
	 static JLabel CoinQuantity3=new JLabel();
	 static JLabel CoinQuantity4=new JLabel();
	 static JLabel CoinQuantity5=new JLabel();
	 static JLabel CoinQuantityTotal = new JLabel();
	 
	 
	 
		
	 JLabel Quantity1=new JLabel();
	
public void display() {
	
	JFrame frame = new JFrame();
	frame.setSize(800,600);

	
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
			if(passwordStatus.equals("Invalid")) {
				drink1.setEnabled(false);
				drink2.setEnabled(false);
				drink3.setEnabled(false);
				drink4.setEnabled(false);
				drink5.setEnabled(false);
				coin1.setEnabled(false);
				coin2.setEnabled(false);
				coin3.setEnabled(false);
				coin4.setEnabled(false);
				coin5.setEnabled(false);
				cointotal.setEnabled(false);
				reset.setEnabled(false);
			}else
			{
				drink1.setEnabled(true);
				drink2.setEnabled(true);
				drink3.setEnabled(true);
				drink4.setEnabled(true);
				drink5.setEnabled(true);
				coin1.setEnabled(true);
				coin2.setEnabled(true);
				coin3.setEnabled(true);
				coin4.setEnabled(true);
				coin5.setEnabled(true);
				cointotal.setEnabled(true);
				reset.setEnabled(true);
			}
			//System.out.println(passwordStatus);		
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
drink1.setEnabled(false);
drink2.setEnabled(false);
drink3.setEnabled(false);
drink4.setEnabled(false);
drink5.setEnabled(false);
coin1.setEnabled(false);
coin2.setEnabled(false);
coin3.setEnabled(false);
coin4.setEnabled(false);
coin5.setEnabled(false);
cointotal.setEnabled(false);
reset.setEnabled(false);

Quantity1.setBounds(200, 160, 100, 15);
Quantity1.setVisible(false);
content.add(Quantity1);

JLabel CoinLabel = new JLabel("Coins Available");
CoinLabel.setBounds(50, 290, 200, 20);
content.add(CoinLabel);
content.revalidate();

coin1.setBounds(10, 350, 100, 20);
coin2.setBounds(100, 350, 100, 20);
coin3.setBounds(200, 350, 100, 20);
coin4.setBounds(300, 350, 100, 20);
coin5.setBounds(400, 350, 100, 20);
cointotal.setBounds(500, 350, 150, 20);

reset.setBounds(10, 500, 150, 20);



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

JTextField CoinQuantity1 = new JTextField(2);
CoinQuantity1.setBounds(30, 400, 50, 20);
content.add(CoinQuantity1);
JTextField CoinQuantity2 = new JTextField(2);
CoinQuantity2.setBounds(120, 400, 50, 20);
content.add(CoinQuantity2);
JTextField CoinQuantity3 = new JTextField(2);
CoinQuantity3.setBounds(230, 400, 50, 20);
content.add(CoinQuantity3);
JTextField CoinQuantity4 = new JTextField(2);
CoinQuantity4.setBounds(320, 400, 50, 20);
content.add(CoinQuantity4);
JTextField CoinQuantity5 = new JTextField(2);
CoinQuantity5.setBounds(410, 400, 50, 20);
content.add(CoinQuantity5);
JTextField CoinQuantityTotal = new JTextField(2);
CoinQuantityTotal.setBounds(530,400, 50, 20);
content.add(CoinQuantityTotal);


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
		//System.out.println(ds.get(4).getQuantity());
		Price=getDrinksPrice(drink5.getText());
		Quantity=getDrinksQuantity(drink5.getText());
		    	 Quantity1.setText(Integer.toString(ds.get(4).getQuantity()));
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

coin1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Integer Quantity;
		Quantity=getCoinsQuantity(Integer.valueOf(coin1.getText()));
		CoinQuantity1.setText(Integer.toString(Quantity));
		CoinQuantity1.setVisible(true);
		
   	    content.revalidate();
	}
});

coin2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Integer Quantity;
		Quantity=getCoinsQuantity(Integer.valueOf(coin2.getText()));
		CoinQuantity2.setText(Integer.toString(Quantity));
		CoinQuantity2.setVisible(true);
   	    content.revalidate();
	}
});

coin3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Integer Quantity;
		Quantity=getCoinsQuantity(Integer.valueOf(coin3.getText()));
		CoinQuantity3.setText(Integer.toString(Quantity));
		CoinQuantity3.setVisible(true);
   	    content.revalidate();
	}
});

coin4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Integer Quantity;
		Quantity=getCoinsQuantity(Integer.valueOf(coin4.getText()));
		CoinQuantity4.setText(Integer.toString(Quantity));
		CoinQuantity4.setVisible(true);
   	    content.revalidate();
	}
});

coin5.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Integer Quantity;
		Quantity=getCoinsQuantity(Integer.valueOf(coin5.getText()));
		CoinQuantity5.setText(Integer.toString(Quantity));
		CoinQuantity5.setVisible(true);
   	    content.revalidate();
	}
});

cointotal.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Integer Total;
		Total=getCoinsTotal();
		CoinQuantityTotal.setText(Integer.toString(Total));
		CoinQuantityTotal.setVisible(true);
		content.revalidate();
	}
});

reset.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		resetCoins();
		coin1.doClick();
		coin2.doClick();
		coin3.doClick();
		coin4.doClick();
		coin5.doClick();
		cointotal.doClick();		
	}
});


content.add(drink1);
content.add(drink2);
content.add(drink3);
content.add(drink4);
content.add(drink5);

content.add(coin1);
content.add(coin2);
content.add(coin3);
content.add(coin4);
content.add(coin5);
content.add(cointotal);
content.add(reset);

frame.setVisible(true);
	
}
public  String verifyPassword(String Password) {
	
	return(vendingmachineControl.verifyPassword(Password));
}



public  int getDrinksQuantity(String brand) {
	return vendingmachineControl.getdrinksQuantity(brand);
	
}

public  int getDrinksPrice(String brand) {
	return vendingmachineControl.getdrinksPrice(brand);
	
}

public  String setNewPrice(String brand,String price) {
	return vendingmachineControl.setNewPrice(brand, price);	
}
	public static Integer getCoinsQuantity(Integer Value) {
		return vendingmachineControl.getCoinsQuantity(Value);
	}
		
	public static Integer getCoinsTotal() {
		return vendingmachineControl.totalSum();
		
	}

	public static void resetCoins() {
		vendingmachineControl.resetCoins();
	}


	
	
}

	
	
	
	

