package com.techelevator;

/**
 * @author student
 *
 */
public class CheckingAccount extends BankAccount {
	/*************************************************************************
	// Constructors for sub-class are required to invoke the super class ctors
	*************************************************************************/
	
	public CheckingAccount(String holderName, String accountNumber) {
		super(holderName, accountNumber);
		
	}
	
	public CheckingAccount(String holderName, String accountNumber, int balance) {
		super(holderName, accountNumber, balance);

	}

	/************************************************************************
	// Overridden methods of the super class
	*************************************************************************/
	
	public int withdraw(int amount) {			 	   // first check to see if they are overdrawn
		if (amount > getBalance()) {			 	   // use the super class member method to access the balance
			if (!(getBalance() - (amount + 10) > -100)) { // if the overdrawn amount is not more than 100
				super.withdraw(10);						   // withdraw - super. is NOT optional
			}
		}
		else {
			super.withdraw(amount);
		}
		return super.getBalance(); 					  // return the current balance - super. is optional
	}
}
