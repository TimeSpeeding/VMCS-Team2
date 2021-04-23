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
	
	public void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				machineryPanel();
			}
		});
	}
	
	public void machineryPanel() {
		JFrame frame = new JFrame("MachineryPanel");
		frame.setSize(500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JTextField coin1Num = new JTextField(cl.get(0).getQuantity());
		coin1Num.setSize(80, 30);
		coin1Num.setLocation(250, 150);
		coin1Num.setEnabled(false);
		
		JTextField coin2Num = new JTextField(cl.get(1).getQuantity());
		coin2Num.setSize(80, 30);
		coin2Num.setLocation(250, 194);
		coin2Num.setEnabled(false);
		
		JTextField coin3Num = new JTextField(cl.get(2).getQuantity());
		coin3Num.setSize(80, 30);
		coin3Num.setLocation(250, 238);
		coin3Num.setEnabled(false);
			
		JTextField coin4Num = new JTextField(cl.get(3).getQuantity());
		coin4Num.setSize(80, 30);
		coin4Num.setLocation(250, 282);
		coin4Num.setEnabled(false);
		
		JTextField coin5Num = new JTextField(cl.get(4).getQuantity());
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
		
		JLabel drink5 = new JLabel("Pepsi-cola");
		drink5.setSize(80, 44);
		drink5.setLocation(140, 576);
		drink5.setFont(drinkFont);
		
		JTextField drink1Num = new JTextField(dl.get(0).getQuantity());
		drink1Num.setSize(80, 30);
		drink1Num.setLocation(250, 410);
		drink1Num.setEnabled(false);
		
		JTextField drink2Num = new JTextField(dl.get(1).getQuantity());
		drink2Num.setSize(80, 30);
		drink2Num.setLocation(250, 454);
		drink2Num.setEnabled(false);
		
		JTextField drink3Num = new JTextField(dl.get(2).getQuantity());
		drink3Num.setSize(80, 30);
		drink3Num.setLocation(250, 498);
		drink3Num.setEnabled(false);
		
		JTextField drink4Num = new JTextField(dl.get(3).getQuantity());
		drink4Num.setSize(80, 30);
		drink4Num.setLocation(250, 542);
		drink4Num.setEnabled(false);
		
		JTextField drink5Num = new JTextField(dl.get(4).getQuantity());
		drink5Num.setSize(80, 30);
		drink5Num.setLocation(250, 586);
		drink5Num.setEnabled(false);
		
		JButton update = new JButton("Update");
		update.setSize(80, 40);
		update.setLocation(200, 660);
		update.setVisible(false);
		update.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
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
		});
		
		JCheckBox lock = new JCheckBox("lock");
		lock.setSize(100, 60);
		lock.setLocation(210, 700);
		lock.setSelected(true);
		lock.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				boolean mark = lock.isSelected();
				coin1Num.setEnabled(!mark);
				coin2Num.setEnabled(!mark);
				coin3Num.setEnabled(!mark);
				coin4Num.setEnabled(!mark);
				coin5Num.setEnabled(!mark);
				drink1Num.setEnabled(!mark);
				drink2Num.setEnabled(!mark);
				drink3Num.setEnabled(!mark);
				drink4Num.setEnabled(!mark);
				drink5Num.setEnabled(!mark);
				update.setVisible(!mark);
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
	
}

