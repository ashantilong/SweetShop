/*
 * CSCI 221, Fall 2018, Programming HW 7
 * <Ashanti S Long 
 * 
 **/

// Constructor: initialize variable 
public class Cookie extends Sweet{
	
	String cookieName;
	int numCookie;
	double priceCookie;
	public Cookie(String name, int many, double price ) {
		
		cookieName = name;
		numCookie = many;
		priceCookie = price;
	}

	@Override
	// pre-condition: none
	//post-condition: return cookie amount 
	public int getCost() {
		double cookieAmount;
		double oneCookie = priceCookie / 12;
		cookieAmount = numCookie *  oneCookie;
		return (int)cookieAmount;
	
	}

	@Override
	// pre-conditionL none
	//post-conditon: returns a string with cookie information 
	public String toString() {
		// TODO Auto-generated method stub
		return cookieName + "   " + SweetShop.toDollarsAndCents(getCost()) + "\n" + numCookie + " @ " + priceCookie /100 + "/dz";
	}

}
