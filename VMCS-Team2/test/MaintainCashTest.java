import org.junit.Test;

import java.util.ArrayList;

import org.junit.*;
import junit.framework.*;






public class MaintainCashTest extends TestCase {
	
	static MainVendingMachineControl vmcs= new MainVendingMachineControl();
	private ArrayList<Drink> ds = MainVendingMachineControl.drinks;
	private ArrayList<Coin> cs = MainVendingMachineControl.coins;
	
	public MaintainCashTest() {
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
		cs=null;
		ds=null;
	}
	@Test
	public void testCoinsValues() {
		assertNotNull(cs);
		assertEquals(5,cs.get(0).getValue());
	}
	@Test
	public void testgetCoinsQuantity() {
		
		assertSame(12,getCoinsQuantity(50));
		
		
	}
	@Test
	public void testReset() {
		//vmcs.resetCoins(); toggle only when testing
		assertNotSame(0,getCoinsQuantity(5));
	}
		
public static Integer getCoinsQuantity(Integer Value) {
		return vmcs.getCoinsQuantity(Value);
	}
		
		
		
		
		
		
		
	}


