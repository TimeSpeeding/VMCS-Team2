import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class CustomerPanel {
	
	private int insertedMoney = 0;
	private int collectCoin = 0;
	private ArrayList<Drink> ds = MainVendingMachineControl.drinks;
	private ArrayList<Coin> cs = MainVendingMachineControl.coins;
	private int[] coins = {0,0,0,0,0};
	
	private Drink d = null;

    private JButton coin1 = new JButton("5c");
    private JButton coin2 = new JButton("10c");
    private JButton coin3 = new JButton("20c");
    private JButton coin4 = new JButton("50c");
    private JButton coin5 = new JButton("$1");
    private JButton coin6 = new JButton("Invalid");
    private JLabel invalidLabel = new JLabel("Invalid Coin");
    private JLabel totalLabel = new JLabel("Total Money Inserted:  " + Integer.toString(insertedMoney) + "  c");
    private JButton drink1 = new JButton(ds.get(0).getBrand());
    private JButton drink2 = new JButton(ds.get(1).getBrand());
    private JButton drink3 = new JButton(ds.get(2).getBrand());
    private JButton drink4 = new JButton(ds.get(3).getBrand());
    private JButton drink5 = new JButton(ds.get(4).getBrand());
    private JLabel changeLabel = new JLabel("No Change Available");
    private JButton terminate = new JButton("Terminate and Return Cash");
    private JLabel collectCoinLabel = new JLabel("Collect Coins:           " + Integer.toString(collectCoin) + "  c");
    private JLabel collectCanLabel = new JLabel("Collect Can Here:    " + "No Can");

	
	public void display() {
		
		JFrame frame = new JFrame("VMCS - Customer Panel");
		frame.setSize(500, 600);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		panel.setLayout(null);

        JLabel titleLabel = new JLabel("Soft Drink Dispenser");
        titleLabel.setBounds(100,20,300,50);
        titleLabel.setFont(new Font("Verdana", Font.PLAIN, 27));
        panel.add(titleLabel);
        
        JLabel coinLabel = new JLabel("Enter Coin here");
        coinLabel.setBounds(10,100,150,10);
        panel.add(coinLabel);
        
        invalidLabel.setBounds(200,160,100,10);
        invalidLabel.setForeground(Color.red);
        invalidLabel.setVisible(false);
        panel.add(invalidLabel);
        
        coin1.setBounds(0, 120, 80, 40);
        coin2.setBounds(80, 120, 80, 40);
        coin3.setBounds(160, 120, 80, 40);
        coin4.setBounds(240, 120, 80, 40);
        coin5.setBounds(320, 120, 80, 40);
        coin6.setBounds(400, 120, 80, 40);
        coin1.setEnabled(false);
        coin2.setEnabled(false);
        coin3.setEnabled(false);
        coin4.setEnabled(false);
        coin5.setEnabled(false);
        coin6.setEnabled(false);
        coin1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		enterCoin(1.7);
             }
        });
        coin2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		enterCoin(2.36);
             }
        });
        coin3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		enterCoin(3.85);
             }
        });
        coin4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		enterCoin(6.56);
             }
        });
        coin5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		enterCoin(7.62);
             }
        });
        coin6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		enterCoin(6.66);
             }
        });
        panel.add(coin1);
        panel.add(coin2);
        panel.add(coin3);
        panel.add(coin4);
        panel.add(coin5);
        panel.add(coin6);
        
        totalLabel.setBounds(100, 180, 300, 10);
        panel.add(totalLabel);
        
        drink1.setEnabled(!checkAvailability(0));
        drink2.setEnabled(!checkAvailability(1));
        drink3.setEnabled(!checkAvailability(2));
        drink4.setEnabled(!checkAvailability(3));
        drink5.setEnabled(!checkAvailability(4));
        drink1.setBounds(0, 200, 160, 40);
        drink2.setBounds(0, 240, 160, 40);
        drink3.setBounds(0, 280, 160, 40);
        drink4.setBounds(0, 320, 160, 40);
        drink5.setBounds(0, 360, 160, 40);
        drink1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		selectBrand(0);
             }
        });
        drink2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		selectBrand(1);
             }
        });
        drink3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		selectBrand(2);
             }
        });
        drink4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		selectBrand(3);
             }
        });
        drink5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		selectBrand(4);
             }
        });
        panel.add(drink1);
        panel.add(drink2);
        panel.add(drink3);
        panel.add(drink4);
        panel.add(drink5);
        
        JLabel drinkPrice1 = new JLabel(Integer.toString(ds.get(0).getPrice()) + "c");
        JLabel drinkPrice2 = new JLabel(Integer.toString(ds.get(1).getPrice()) + "c");
        JLabel drinkPrice3 = new JLabel(Integer.toString(ds.get(2).getPrice()) + "c");
        JLabel drinkPrice4 = new JLabel(Integer.toString(ds.get(3).getPrice()) + "c");
        JLabel drinkPrice5 = new JLabel(Integer.toString(ds.get(4).getPrice()) + "c");
        drinkPrice1.setBounds(200, 200, 40, 40);
        drinkPrice2.setBounds(200, 240, 40, 40);
        drinkPrice3.setBounds(200, 280, 40, 40);
        drinkPrice4.setBounds(200, 320, 40, 40);
        drinkPrice5.setBounds(200, 360, 40, 40);
        panel.add(drinkPrice1);
        panel.add(drinkPrice2);
        panel.add(drinkPrice3);
        panel.add(drinkPrice4);
        panel.add(drinkPrice5);
        
        JLabel drinkAvailabity1 = new JLabel("Not in Stock");
        JLabel drinkAvailabity2 = new JLabel("Not in Stock");
        JLabel drinkAvailabity3 = new JLabel("Not in Stock");
        JLabel drinkAvailabity4 = new JLabel("Not in Stock");
        JLabel drinkAvailabity5 = new JLabel("Not in Stock");
        drinkAvailabity1.setBounds(300, 200, 120, 40);
        drinkAvailabity2.setBounds(300, 240, 120, 40);
        drinkAvailabity3.setBounds(300, 280, 120, 40);
        drinkAvailabity4.setBounds(300, 320, 120, 40);
        drinkAvailabity5.setBounds(300, 360, 120, 40);
        drinkAvailabity1.setForeground(Color.red);
        drinkAvailabity2.setForeground(Color.red);
        drinkAvailabity3.setForeground(Color.red);
        drinkAvailabity4.setForeground(Color.red);
        drinkAvailabity5.setForeground(Color.red);
        drinkAvailabity1.setVisible(checkAvailability(0));
        drinkAvailabity2.setVisible(checkAvailability(1));
        drinkAvailabity3.setVisible(checkAvailability(2));
        drinkAvailabity4.setVisible(checkAvailability(3));
        drinkAvailabity5.setVisible(checkAvailability(4));
        panel.add(drinkAvailabity1);
        panel.add(drinkAvailabity2);
        panel.add(drinkAvailabity3);
        panel.add(drinkAvailabity4);
        panel.add(drinkAvailabity5);
        
        changeLabel.setBounds(150, 420, 200, 20);
        changeLabel.setForeground(Color.RED);
        changeLabel.setVisible(false);
        panel.add(changeLabel);
        
        terminate.setBounds(150, 460, 200, 20);
        terminate.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		terminate();
             }
        });
        panel.add(terminate);
        
        collectCoinLabel.setBounds(150, 500, 200, 20);
        collectCanLabel.setBounds(150, 530, 200, 20);
        panel.add(collectCanLabel);
        panel.add(collectCoinLabel);        
        
        frame.setVisible(true);
	}
	
	public void enterCoin (double weight) {
		int value = CoinMonitor.verifyCoin(weight);
		if (value == 0) invalidLabel.setVisible(true);
		else {
			invalidLabel.setVisible(false);
			insertedMoney += value;
			switch(value) {
			case 5: coins[0]++;
			case 10: coins[1]++;
			case 20: coins[2]++;
			case 50: coins[3]++;
			case 100: coins[4]++;
			}
		}
		totalLabel.setText("Total Money Inserted:  " + Integer.toString(insertedMoney) + "  c");
		if (insertedMoney >= d.getPrice()) purchase();
		return;
	}
	
	public void selectBrand (int i) {
		d = ds.get(i);
        coin1.setEnabled(true);
        coin2.setEnabled(true);
        coin3.setEnabled(true);
        coin4.setEnabled(true);
        coin5.setEnabled(true);
        coin6.setEnabled(true);
        drink1.setEnabled(false);
        drink2.setEnabled(false);
        drink3.setEnabled(false);
        drink4.setEnabled(false);
        drink5.setEnabled(false);
        changeLabel.setVisible(false);
		return;
	}
	
	public boolean checkAvailability(int i) {
		if (ds.get(i).getQuantity() == 0) return true;
		else return false;
	}
	
	public void purchase() {
		terminate.setEnabled(false);
		d.setQuantity(d.getQuantity() - 1);
		for (int i = 0; i < 5; i++) {
			cs.get(i).setQuantity(cs.get(i).getQuantity() + coins[i]);
		}
		collectCoin = insertedMoney - d.getPrice();
		collectCanLabel.setText("Collect Can Here:    " + d.getBrand());
		int change = collectCoin;
		while(change > 0) {
			if ((change < 10 && cs.get(0).getQuantity() == 0) || (change < 20 && cs.get(0).getQuantity() == 0 && cs.get(1).getQuantity() == 0)
					|| (change < 50 && cs.get(0).getQuantity() == 0 && cs.get(1).getQuantity() == 0 && cs.get(2).getQuantity() == 0)
					|| (change < 100 && cs.get(0).getQuantity() == 0 && cs.get(1).getQuantity() == 0 && cs.get(2).getQuantity() == 0 && cs.get(3).getQuantity() == 0)) {
				changeLabel.setVisible(true);
				break;
			}
			for(int i = 4; i >= 0; i--) {
				if(cs.get(i).getValue() <= change && cs.get(i).getQuantity() > 0) {
					change -= cs.get(i).getValue();
					cs.get(i).setQuantity(cs.get(i).getQuantity() - 1);
					break;
				}
			}
		}
		restart();
	}
	
	public void terminate() {
		collectCoin = insertedMoney;
		restart();
	}
	
	public void restart() {
		collectCoinLabel.setText("Collect Coins:           " + Integer.toString(collectCoin) + "  c");
		insertedMoney = 0;
		totalLabel.setText("Total Money Inserted:  " + Integer.toString(insertedMoney) + "  c");
		for (int i = 0; i < 5; i++) coins[i] = 0;
		coin1.setEnabled(false);
	    coin2.setEnabled(false);
	    coin3.setEnabled(false);
	    coin4.setEnabled(false);
	    coin5.setEnabled(false);
	    coin6.setEnabled(false);
	    drink1.setEnabled(!checkAvailability(0));
	    drink2.setEnabled(!checkAvailability(1));
	    drink3.setEnabled(!checkAvailability(2));
	    drink4.setEnabled(!checkAvailability(3));
	    drink5.setEnabled(!checkAvailability(4));
	    terminate.setEnabled(true);
	}
}
