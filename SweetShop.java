/*
 * CSCI 221, Fall 2018, Programming HW 7
 * <Ashanti S Long 
 * Program: Writing software to support of a Sweet Shop which sells different items. These programs are going tp be use for the checkout
 * Certification: This code was written by me alone; however, I discussed it with CSL 
 **/
// SweetShop.java - constants and method to format cents 
// as dollars and cents
// Adapted from S. Balik

import java.text.*;
public class SweetShop {

  public final static double TAX_RATE = 6.5;        // 6.5%
  public final static String STORE_NAME = "221 Sweet Shop";
  public final static int MAX_ITEM_NAME_SIZE = 25;
  public final static int COST_WIDTH = 6;
  
  // Returns a String representation of cents converted to
  // dollars and cents with $-sign
  public static String toDollarsAndCents(int cents){
     
     NumberFormat currencyFormatter = 
            NumberFormat.getCurrencyInstance();
     return currencyFormatter.format(cents/100.0);
  }
 
      
      
}