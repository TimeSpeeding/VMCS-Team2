import org.junit.Test;

import java.util.ArrayList;

import org.junit.*;
import junit.framework.*;

public class MachineryTest extends TestCase{
	
	private ArrayList<Drink> ds;
	private ArrayList<Coin> cs;
	private MachineryPanel mp;
	
	public MachineryTest() {
		super();
	}
	
	@Before
	 public void setUp() throws Exception{
		//Initialize Test Fixtures
		ds = MainVendingMachineControl.drinks;
		cs = MainVendingMachineControl.coins;
		ds.add(new Drink("Coca-Cola", 75, 5));
		ds.add(new Drink("Fanta", 85, 7));
		ds.add(new Drink("Sarsi", 70, 12));
		ds.add(new Drink("Soya Bean", 65, 0));
		ds.add(new Drink("Coca-Cola", 75, 1));		
		cs.add(new Coin(5, 1.7, 22));
		cs.add(new Coin(10, 2.36, 37));
		cs.add(new Coin(20, 3.85, 9));
		cs.add(new Coin(50, 6.56, 12));
		cs.add(new Coin(100, 7.62, 10));
		mp = new MachineryPanel();
	}
	@After
	 public void tearDown() throws Exception{
		// Uninitialize test Fixtures
		ds = null;
		cs = null;
		mp = null;
	}	

	@Test
	public void testUpdate() {
		assertNotNull(ds);
		mp.display();
		assertEquals(5, ds.get(0).getQuantity());
		mp.drink1Num.setText("77");
		mp.updateValue();
		assertEquals(77, ds.get(0).getQuantity());
	}

}
