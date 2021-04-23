
import java.util.ArrayList;
import java.util.Iterator;


public class MainVendingMachineControl {
	public static ArrayList<Drink> drinks = new ArrayList<Drink>();
	public static ArrayList<Coin> coins = new ArrayList<Coin>();
 	
	public static String savedPassword="1234";
	
	public static void main(String[] args) {
		prepare();
		ControlPanel cp = new ControlPanel();
		cp.display();
	}
	
	public static void prepare() {
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
	
	public boolean getDrinkAvailability(int i) {
		if (drinks.get(i).getQuantity() == 0) return true;
		else return false;
	}
	
	public boolean makeChange(int change) {
		while(change > 0) {
			if ((change < 10 && coins.get(0).getQuantity() == 0) || (change < 20 && coins.get(0).getQuantity() == 0 && coins.get(1).getQuantity() == 0)
					|| (change < 50 && coins.get(0).getQuantity() == 0 && coins.get(1).getQuantity() == 0 && coins.get(2).getQuantity() == 0)
					|| (change < 100 && coins.get(0).getQuantity() == 0 && coins.get(1).getQuantity() == 0 && coins.get(2).getQuantity() == 0 && coins.get(3).getQuantity() == 0)) {
				return true;
			}
			for(int i = 4; i >= 0; i--) {
				if(coins.get(i).getValue() <= change && coins.get(i).getQuantity() > 0) {
					change -= coins.get(i).getValue();
					coins.get(i).setQuantity(coins.get(i).getQuantity() - 1);
					break;
				}
			}
		}
		return false;
	}
	
	public String verifyPassword(String password) {
		if (password.equals(savedPassword)){
			return "Valid Password";
		}
		else {
			return "Invalid";
		}
	} 
	
	
	public String setNewPrice(String brand,String Price) {
		prepare();
		int newPrice=0;
		Iterator<Drink> iter = drinks.iterator();
		 while (iter.hasNext()) {
		      Drink item = iter.next();
		     if(brand.equals(item.getBrand())) {
		    	 item.setPrice(Integer.parseInt(Price));
		    	  newPrice=item.getPrice();
		    	  }
		     }
		 return "price of"+" "+brand+" "+"changed to"+" "+newPrice;
		
	}
	
	public Integer getdrinksQuantity(String brand) {
		prepare();
		Integer Quant=0;
		Iterator<Drink> iter = drinks.iterator();
		 while (iter.hasNext()) {
		      Drink item = iter.next();
		     if(brand.equals(item.getBrand())) {
		    	 Quant= item.getQuantity();
		    	 break;
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
		      
		     




