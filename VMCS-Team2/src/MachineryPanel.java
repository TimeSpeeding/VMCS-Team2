import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.*;

public class MachineryPanel {
	
	private ArrayList<Drink> dl = MainVendingMachineControl.drinks;
	private ArrayList<Coin> cl = MainVendingMachineControl.coins;

	private JTextField coin1Num = new JTextField(Integer.toString(cl.get(0).getQuantity()));
	private JTextField coin2Num = new JTextField(Integer.toString(cl.get(1).getQuantity()));
	private JTextField coin3Num = new JTextField(Integer.toString(cl.get(2).getQuantity()));
	private JTextField coin4Num = new JTextField(Integer.toString(cl.get(3).getQuantity()));
	private JTextField coin5Num = new JTextField(Integer.toString(cl.get(4).getQuantity()));

	private JTextField drink1Num = new JTextField(Integer.toString(dl.get(0).getQuantity()));
	private JTextField drink2Num = new JTextField(Integer.toString(dl.get(1).getQuantity()));
	private JTextField drink3Num = new JTextField(Integer.toString(dl.get(2).getQuantity()));
	private JTextField drink4Num = new JTextField(Integer.toString(dl.get(3).getQuantity()));
	private JTextField drink5Num = new JTextField(Integer.toString(dl.get(4).getQuantity()));
	private JButton update = new JButton("Update");
	
	public void display() {
		JFrame frame = new JFrame("MachineryPanel");
		frame.setSize(500, 800);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		Container container = frame.getContentPane();
		container.setLayout(null);
		
		Font subTitleFont = new Font("Georgia", Font.ITALIC, 20);
		Font cashFont = new Font("Calibri", Font.BOLD, 20);
		Font drinkFont = new Font("Calibri", Font.BOLD, 18);
		
		JLabel machineryTitle = new JLabel("VMCS - Machinery Panel");
		machineryTitle.setSize(400, 80);
		machineryTitle.setLocation(130, 0);
		Font titleFont = new Font(Font.SERIF, Font.BOLD, 20);
		machineryTitle.setFont(titleFont);
		
		JLabel coinTitle = new JLabel("Quantity of coins");
		coinTitle.setSize(300, 70);
		coinTitle.setLocation(10, 80);
		coinTitle.setFont(subTitleFont);
		
		JLabel coin1 = new JLabel("5c");
		coin1.setSize(50, 44);
		coin1.setLocation(200, 150);
		coin1.setFont(cashFont);
		
		JLabel coin2 = new JLabel("10c");
		coin2.setSize(50, 44);
		coin2.setLocation(200, 194);
		coin2.setFont(cashFont);
		
		JLabel coin3 = new JLabel("20c");
		coin3.setSize(50, 44);
		coin3.setLocation(200, 238);
		coin3.setFont(cashFont);
		
		JLabel coin4 = new JLabel("50c");
		coin4.setSize(50, 44);
		coin4.setLocation(200, 282);
		coin4.setFont(cashFont);
		
		JLabel coin5 = new JLabel("$1");
		coin5.setSize(50, 44);
		coin5.setLocation(200, 326);
		coin5.setFont(cashFont);
		
		coin1Num.setSize(80, 30);
		coin1Num.setLocation(250, 150);
		coin1Num.setEnabled(false);
		
		coin2Num.setSize(80, 30);
		coin2Num.setLocation(250, 194);
		coin2Num.setEnabled(false);
		
		coin3Num.setSize(80, 30);
		coin3Num.setLocation(250, 238);
		coin3Num.setEnabled(false);
			
		coin4Num.setSize(80, 30);
		coin4Num.setLocation(250, 282);
		coin4Num.setEnabled(false);
		
		coin5Num.setSize(80, 30);
		coin5Num.setLocation(250, 326);
		coin5Num.setEnabled(false);
		
		JLabel drinkTitle = new JLabel("Quantity of cans");
		drinkTitle.setSize(300, 60);
		drinkTitle.setLocation(10, 360);
		drinkTitle.setFont(subTitleFont);
			
		JLabel drink1 = new JLabel("Coca-cola");
		drink1.setSize(80, 44);
		drink1.setLocation(140, 400);
		drink1.setFont(drinkFont);
		
		JLabel drink2 = new JLabel("Fanta");
		drink2.setSize(80, 44);
		drink2.setLocation(140, 444);
		drink2.setFont(drinkFont);
		
		JLabel drink3 = new JLabel("Sarsi");
		drink3.setSize(80, 44);
		drink3.setLocation(140, 488);
		drink3.setFont(drinkFont);
		
		JLabel drink4 = new JLabel("Soya Bean");
		drink4.setSize(80, 44);
		drink4.setLocation(140, 532);
		drink4.setFont(drinkFont);
		
		JLabel drink5 = new JLabel("Coca-cola");
		drink5.setSize(80, 44);
		drink5.setLocation(140, 576);
		drink5.setFont(drinkFont);
		
		drink1Num.setSize(80, 30);
		drink1Num.setLocation(250, 410);
		drink1Num.setEnabled(false);
		
		drink2Num.setSize(80, 30);
		drink2Num.setLocation(250, 454);
		drink2Num.setEnabled(false);
		
		drink3Num.setSize(80, 30);
		drink3Num.setLocation(250, 498);
		drink3Num.setEnabled(false);
		
		drink4Num.setSize(80, 30);
		drink4Num.setLocation(250, 542);
		drink4Num.setEnabled(false);
		
		drink5Num.setSize(80, 30);
		drink5Num.setLocation(250, 586);
		drink5Num.setEnabled(false);
		
		update.setSize(80, 40);
		update.setLocation(200, 660);
		update.setVisible(false);
		update.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateValue();
			}
		});
		
		JCheckBox lock = new JCheckBox("lock");
		lock.setSize(100, 60);
		lock.setLocation(210, 700);
		lock.setSelected(true);
		lock.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				boolean mark = lock.isSelected();
				changeDoorStatus(!mark);
			}
		});
		
		container.add(machineryTitle);
		container.add(coinTitle);
		container.add(coin1);
		container.add(coin2);
		container.add(coin3);
		container.add(coin4);
		container.add(coin5);
		container.add(coin1Num);
		container.add(coin2Num);
		container.add(coin3Num);
		container.add(coin4Num);
		container.add(coin5Num);
		container.add(drinkTitle);
		container.add(drink1);
		container.add(drink2);
		container.add(drink3);
		container.add(drink4);
		container.add(drink5);
		container.add(drink1Num);
		container.add(drink2Num);
		container.add(drink3Num);
		container.add(drink4Num);
		container.add(drink5Num);
		container.add(update);
		container.add(lock);
	}
	
	public void updateValue() {
		cl.get(0).setQuantity(Integer.valueOf(coin1Num.getText()).intValue());
		cl.get(1).setQuantity(Integer.valueOf(coin2Num.getText()).intValue());
		cl.get(2).setQuantity(Integer.valueOf(coin3Num.getText()).intValue());
		cl.get(3).setQuantity(Integer.valueOf(coin4Num.getText()).intValue());
		cl.get(4).setQuantity(Integer.valueOf(coin5Num.getText()).intValue());
		
		dl.get(0).setQuantity(Integer.valueOf(drink1Num.getText()).intValue());
		dl.get(1).setQuantity(Integer.valueOf(drink2Num.getText()).intValue());
		dl.get(2).setQuantity(Integer.valueOf(drink3Num.getText()).intValue());
		dl.get(3).setQuantity(Integer.valueOf(drink4Num.getText()).intValue());
		dl.get(4).setQuantity(Integer.valueOf(drink5Num.getText()).intValue());
	}
	
	public void changeDoorStatus(boolean isDoorOpened) {
		coin1Num.setEnabled(isDoorOpened);
		coin2Num.setEnabled(isDoorOpened);
		coin3Num.setEnabled(isDoorOpened);
		coin4Num.setEnabled(isDoorOpened);
		coin5Num.setEnabled(isDoorOpened);
		drink1Num.setEnabled(isDoorOpened);
		drink2Num.setEnabled(isDoorOpened);
		drink3Num.setEnabled(isDoorOpened);
		drink4Num.setEnabled(isDoorOpened);
		drink5Num.setEnabled(isDoorOpened);
		update.setVisible(isDoorOpened);
	}
	
}

