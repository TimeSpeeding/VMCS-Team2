
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;


public class MainVendingMachineControl {
	public static ArrayList<Drink> drinks = new ArrayList<Drink>();
	public static ArrayList<Coin> coins =new ArrayList<Coin>();
 	
	public static String savedPassword="1234";

	public void main(String[] args) {
		prepare();
	}
	
	public void prepare() {
		drinks.add(new Drink("Coca-Cola", 75, 5));
		drinks.add(new Drink("Fanta", 85, 7));
		drinks.add(new Drink("Sarsi", 70, 12));
		drinks.add(new Drink("Soya Bean", 65, 0));
		drinks.add(new Drink("Coca-Cola", 75, 1));
		
		coins.add(new Coin(5, 1.7, 22));
		coins.add(new Coin(10, 2.36, 37));
		coins.add(new Coin(20, 3.85, 9));
		coins.add(new Coin(50, 6.56, 12));
		coins.add(new Coin(100, 7.62, 10));
	}
	
	
	public String verifyPassword(String password) {
		if (password.equals(savedPassword)){
			return "Valid Pass";
		}
		else {
			return "Invalid";
		}
	}
	
	
	public Integer setNewPrice(String brand,String Price) {
		prepare();
		int newPrice=0;
		Iterator<Drink> iter = drinks.iterator();
		 while (iter.hasNext()) {
		      Drink item = iter.next();
		     if(brand.equals(item.getBrand())) {
		    	 System.out.println(item.getBrand());
		    	  item.setPrice(Integer.parseInt(Price));
		    	  newPrice=item.getPrice();
		    	  break;
		      }
		     }
		 return newPrice;
		
	}
	
	public Integer getdrinksQuantity(String brand) {
		prepare();
		Integer Quant=0;
		Iterator<Drink> iter = drinks.iterator();
		 while (iter.hasNext()) {
		      Drink item = iter.next();
		     if(brand.equals(item.getBrand())) {
		    	 Quant= item.getQuantity();
		      }
}
		 return Quant;
		
	}
	
	public Integer getdrinksPrice(String brand) {
		prepare();
		Integer Price=0;
		Iterator<Drink> iter = drinks.iterator();
		 while (iter.hasNext()) {
		      Drink item = iter.next();
		     if(brand.equals(item.getBrand())) {
		    	 Price= item.getPrice();
		    	 break;
		      }
}
		 return Price;
		
	}
	}
		      
		     




