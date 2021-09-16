/*
 * CSCI 221, Fall 2018, Programming HW 7
 * <Ashanti S Long 
 * 
 **/

// Constructor: initialize variable 
public class Sundae extends IceCream {
	private double costTopping;
	private String askTopping;
	public Sundae(String name, double cost, String nameTopping, double topping) {
		super(name,cost);
		costTopping = topping;
		askTopping = nameTopping;
		// TODO Auto-generated constructor stub
	}
	// pre-condition: none
	//post-condition: return Sundae amount 
	public int getCost() {
		
		return (int) (super.getCost() + costTopping);		

		
	}
	// pre-condition: none
	//post-condition: return Sundae informaton
	public String toString() {
		
		return askTopping + " Sundae with\n" + name + SweetShop.toDollarsAndCents(getCost());
		
		
	}

}
