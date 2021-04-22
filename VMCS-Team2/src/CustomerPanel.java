import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class CustomerPanel {
	
	private int currentPrice = 0;
	private int insertedMoney = 0;

    private JButton coin1=new JButton("5c");
    private JButton coin2=new JButton("10c");
    private JButton coin3=new JButton("20c");
    private JButton coin4=new JButton("50c");
    private JButton coin5=new JButton("$1");
    private JButton coin6=new JButton("Invalid");

	
	public void main(String[] args) {
		JFrame frame = new JFrame("VMCS - Customer Panel");
		frame.setSize(500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
        
        JLabel invalidLabel = new JLabel("Invalid Coin");
        invalidLabel.setBounds(200,170,100,10);
        invalidLabel.setForeground(Color.red);
        invalidLabel.setVisible(false);
        panel.add(invalidLabel);
        
        coin1.setBounds(0, 120, 80, 40);
        coin2.setBounds(80, 120, 80, 40);
        coin3.setBounds(160, 120, 80, 40);
        coin4.setBounds(240, 120, 80, 40);
        coin5.setBounds(320, 120, 80, 40);
        coin6.setBounds(400, 120, 80, 40);
        coin1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                invalidLabel.setVisible(false);
        		enterCoin(5);
             }
        });
        coin2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                invalidLabel.setVisible(false);
        		enterCoin(10);
             }
        });
        coin3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                invalidLabel.setVisible(false);
        		enterCoin(20);
             }
        });
        coin4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                invalidLabel.setVisible(false);
        		enterCoin(50);
             }
        });
        coin5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                invalidLabel.setVisible(false);
        		enterCoin(100);
             }
        });
        coin6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                invalidLabel.setVisible(true);        		
             }
        });
        panel.add(coin1);
        panel.add(coin2);
        panel.add(coin3);
        panel.add(coin4);
        panel.add(coin5);
        panel.add(coin6);
        
        
        
        frame.setVisible(true);
	}
	
	public void enterCoin (int value) {
		return;
	}
	
	
}
