import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
 
import javax.swing.*;

public class ControlPanel {
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				controlPanel();
			}
		});
	}
	
	public static void controlPanel() {
		JFrame frame= new JFrame("VMCS - Control Panel");
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
		start.setSize(460, 70);
		start.setLocation(10, 50);
		
		JButton end = new JButton("End Simulation");
		end.setSize(460, 70);
		end.setLocation(10, 120);
		
		JButton actCustomer = new JButton("Begin Simulation");
		actCustomer.setSize(460, 70);
		actCustomer.setLocation(10, 190);
		
		JButton actMaintainer = new JButton("Begin Simulation");
		actMaintainer.setSize(460, 70);
		actMaintainer.setLocation(10,260);
		
		JButton actMachinery = new JButton("Begin Simulation");
		actMachinery.setSize(460, 70);
		actMachinery.setLocation(10, 330);
		
		container.add(title);
		container.add(start);
		container.add(end);
		container.add(actCustomer);
		container.add(actMaintainer);
		container.add(actMachinery);
	}
}
