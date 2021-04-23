import org.junit.Test;

import java.util.ArrayList;

import org.junit.*;
import junit.framework.*;

public class CustomerTest extends TestCase{
	
	private MainVendingMachineControl vmcs;
	private ArrayList<Drink> ds;
	private ArrayList<Coin> cs;
	
	public CustomerTest() {
		super();
	}
	
	@Before
	 public void setUp() throws Exception{
		//Initialize Test Fixtures
		vmcs = new MainVendingMachineControl();
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
	}
	@After
	 public void tearDown() throws Exception{
		// Uninitialize test Fixtures
		vmcs = null;
		ds = null;
		cs = null;
	}	

	@Test
	public void testAvailability() {
		assertNotNull(ds);
		assertTrue(vmcs.getDrinkAvailability(3));
		assertFalse(vmcs.getDrinkAvailability(4));
		ds.get(4).setQuantity(0);
		assertTrue(vmcs.getDrinkAvailability(4));			
	}
	
	@Test
	public void testMakeChange() {
		assertNotNull(cs);
		assertEquals(37, cs.get(1).getQuantity());
		assertEquals(9, cs.get(2).getQuantity());
		assertFalse(vmcs.makeChange(30));
		assertEquals(36, cs.get(1).getQuantity());
		assertEquals(8, cs.get(2).getQuantity());	
		cs.get(0).setQuantity(0);
		assertTrue(vmcs.makeChange(25));
	}
	
	@Test
	public void testVerifyCoin() {
		assertEquals(5, CoinMonitor.verifyCoin(1.7));
		assertEquals(50, CoinMonitor.verifyCoin(6.56));
		assertEquals(0, CoinMonitor.verifyCoin(6.66));
		assertEquals(0, CoinMonitor.verifyCoin(100));		
	}

}
