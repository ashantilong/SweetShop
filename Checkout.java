import java.util.ArrayList;
/*
 * CSCI 221, Fall 2018, Programming HW 7
 * <Ashanti S Long 
 * 
 **/


public class Checkout {
	ArrayList<Sweet> sweetList;
	// Constructor: initialize variable 
	public Checkout() {
		
		sweetList = new ArrayList<Sweet>();
	}
	// pre-condition: none
	//post-condition: return a clear arraylist  
	public void clear() {
		sweetList.clear();
	}
	// pre-condition: none
	//post-condition: returns the added new items to the arraylist 
	public void enterItem(Sweet item) {
		
		sweetList.add(item);
	}
	// pre-condition: none
	//post-condition: return the size 
	public int numberOfItems() {
		
		return sweetList.size();
		
	}
	// pre-condition: none
	//post-condition: return the total amount of all the items 
	public int totalCost() {
		
		int total = 0;
		
		for(int i = 0; i < sweetList.size(); i++ ) {
			
			total = total + sweetList.get(i).getCost();
		}
			
		return total;
		
		
	}
	// pre-condition: none
	//post-condition: return taxes 
	public int totalTax() {
		
		int tax = 0;
		
		for (int i = 0; i < sweetList.size(); i++) {
			tax = (int) (tax + sweetList.get(i).getCost() * ((SweetShop.TAX_RATE)));
		}
		
		
		
		return (int) (Math.round((tax) / 100.0));
	}
	// pre-condition: none
	//post-condition: return all the information  
	public String toString() {
		
		String receipt;
		
		receipt = "           " + SweetShop.STORE_NAME;
		receipt = receipt + "\n         ------------------------";
		receipt = receipt + "\n";
		for (int i = 0; i < sweetList.size(); i++) {
			receipt = receipt + "\n" + sweetList.get(i).toString();
		}
		receipt = receipt + "\n";
		receipt = receipt + "\nTax                        "+ SweetShop.toDollarsAndCents(totalTax());
		receipt = receipt + "\nTotalCost                  "+ SweetShop.toDollarsAndCents(totalCost()+ totalTax());
		
		
		
		
		
		
		return receipt;
		
		
	}

}
