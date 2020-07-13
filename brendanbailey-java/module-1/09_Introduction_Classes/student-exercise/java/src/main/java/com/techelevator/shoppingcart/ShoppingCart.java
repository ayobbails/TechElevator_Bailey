package com.techelevator.shoppingcart;

public class ShoppingCart {
	
	private int totalNumberOfItems;
	private double totalAmountOwed;
	
	
	
	public ShoppingCart() {
	}
	
	
public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}

	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}

public double getAveragePricePerItem() {
		if (totalAmountOwed > 1 && totalNumberOfItems > 1)
	return totalAmountOwed / totalNumberOfItems; {
	 return 0;
	}
}
	
public void addItems(int numberOfItems, double pricePerItem) {
// Updates -???- totalNumberOfItems and increases totalAmountOwed 
// by (pricePerItem * numberOfItems)
	totalNumberOfItems += numberOfItems;
	totalAmountOwed = pricePerItem * totalNumberOfItems;

}
	
public void empty() {
	totalNumberOfItems *= 0;
	totalAmountOwed *= 0;
}
	
	
	
	
}
