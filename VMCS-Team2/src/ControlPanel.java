import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.*;

public class ControlPanel {
	
	private CustomerPanel customerPanel = new CustomerPanel();
	 private MaintainerPanel maintainerPanel = new MaintainerPanel();
	 private MachineryPanel machineryPanel = new MachineryPanel();
	
	JButton actCustomer = new JButton("Activate Customer Panel");
	private JButton actMaintainer = new JButton("Activate Maintainer Panel");
	private JButton actMachinery = new JButton("Activate Machinery Panel");
	
	
	public void display() {
		JFrame frame= new JFrame("VMCS - Simulator Control Panel");
		frame.setSize(500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		Container container = frame.getContentPane();
		container.setLayout(null);
		
		Font titleFont = new Font(Font.SERIF, Font.BOLD, 20);
		
		JLabel title = new JLabel("Simulator Control Panel");
		title.setBounds(140, 10, 300, 30);
		title.setFont(titleFont);
		
		JButton start = new JButton("Begin Simulation");
		start.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		start();
             }
        });
		start.setSize(460, 70);
		start.setLocation(10, 50);
		
		JButton end = new JButton("End Simulation");
		end.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		end();
             }
        });
		end.setSize(460, 70);
		end.setLocation(10, 120);
		
		actCustomer.setEnabled(false);
		actCustomer.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		customerPanel.display();
             }
        });
		actCustomer.setSize(460, 70);
		actCustomer.setLocation(10, 190);
		
		actMaintainer.setEnabled(false);
		actMaintainer.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		maintainerPanel.display();
             }
        });
		actMaintainer.setSize(460, 70);
		actMaintainer.setLocation(10,260);
		
		actMachinery.setEnabled(false);
		actMachinery.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		machineryPanel.display();
             }
        });
		actMachinery.setSize(460, 70);
		actMachinery.setLocation(10, 330);
		
		container.add(title);
		container.add(start);
		container.add(end);
		container.add(actCustomer);
		container.add(actMaintainer);
		container.add(actMachinery);
	}
	
	public void start() {
		actCustomer.setEnabled(true);
		actMaintainer.setEnabled(true);
		actMachinery.setEnabled(true);
	}
	
	public void end() {
		actCustomer.setEnabled(false);
		actMaintainer.setEnabled(false);
		actMachinery.setEnabled(false);
	}
}
