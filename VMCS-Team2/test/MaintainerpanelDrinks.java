import org.junit.Test;

import java.util.ArrayList;
import org.junit.*;
import junit.framework.*;
public class MaintainerpanelDrinks extends TestCase {
	
	public String passwordStatus="";
	private ArrayList<Drink> ds;
	private ArrayList<Coin> cs;
	private MaintainerPanel mp;
	
	private MainVendingMachineControl vmcs;

	public MaintainerpanelDrinks() {
		super();
		// TODO Auto-generated constructor stub
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
		mp=new MaintainerPanel();
	}
	
	@After
	 public void tearDown() throws Exception{
		// Uninitialize test Fixtures
		vmcs = null;
		ds = null;
		cs = null;
		mp = null;
	}	
	
	@Test
	public void testgetDrinksQuantity() {
		assertNotNull(ds);
		assertEquals(7,ds.get(1).getQuantity() );
		assertEquals(7,mp.getDrinksQuantity("Fanta"));
	}
	@Test
	public void testgetDrinksPrice() {
		assertNotNull(ds);
		assertEquals(75,ds.get(0).getPrice() );
		assertEquals(75,mp.getDrinksPrice(ds.get(0).getBrand()));
    }
	
	@Test
	public void testsetnewprice() {
		assertNotNull(ds);
		assertEquals(75,ds.get(0).getPrice());
		mp.setNewPrice(ds.get(0).getBrand(), "80");
		assertEquals(80,ds.get(0).getPrice());
    }
	
	

}
