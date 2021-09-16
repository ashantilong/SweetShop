/*
 * CSCI 221, Fall 2018, Programming HW 7
 * <Ashanti S Long 
 * 
 **/
public class IceCream extends Sweet {
	
	//private String nameFlavor;
	private double childCost;
	// Constructor: initialize variable 
	public IceCream(String name, double cost) {
		super(name);
		childCost = cost;
	}

	@Override
	// pre-condition: none
	//post-condition: return Ice Cream amount 
	public int getCost() {
		
		
		return (int) childCost;
	}

	@Override
	// pre-condition: none
	//post-condition: return Ice cream information  
	public String toString() {
		// TODO Auto-generated method stub
		return name + SweetShop.toDollarsAndCents((int) childCost);
	}
	
	

}
