/*
 * CSCI 221, Fall 2018, Programming HW 7
 * <Ashanti S Long 
 * 
 **/

// Constructor: initialize variable 
public class Candy extends Sweet {
	
	private double weight;
	private int pricePerPound;
	public Candy(String name, double pounds, int cent) {
		super(name);
		weight = pounds;
		pricePerPound = cent;
		
	}

	@Override
	// pre-condition: none
	//post-condition: return Candy amount 
	public int getCost() {
		
	double childCost = weight * pricePerPound;
	
	childCost = Math.round(childCost);
		return (int) childCost;
	}

	@Override
	// pre-condition: none
	//post-condition: return Candy amount 
	public String toString() {
		
		return name + SweetShop.toDollarsAndCents(getCost()) + "\n" + weight + " lbs @ " + (double)pricePerPound /100.0 + "/lb";
	}
	

}
 