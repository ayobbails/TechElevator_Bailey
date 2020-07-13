package com.techelevator;

public class BankAccount {
	/***********************************************************/
	// Data members / Attributes
	/***********************************************************/
	
	private String accountHolder; // = ""; Safe to initialize data members at definition
	
	private String accountNumber; // = "";
	
	private int    balance;		  // = 0;
	
	/***********************************************************/
	// Constructors - Initialize new objects of the class
	/***********************************************************/
	
	// 2 - argument - constructor
	public BankAccount (String holderName, String accountNumber) {
		
		accountHolder = 	 holderName;
		this.accountNumber = accountNumber; // this. is required if the parameter name is the same as its member name
		balance = 			 0;				// initialize every data member
	}
	// 3 - argument - constructor
	public BankAccount (String holderName, String accountNumber, int balance) {
		
		accountHolder = 	 holderName;
		this.accountNumber = accountNumber; // this. is required if the parameter name is the same as its member name
		this.balance = 		 0;
	}
	
	
	/***********************************************************/
	// Getters - No Setters (per say)
	/***********************************************************/
	
	/**
	 * @return the accountHolder
	 */
	public String getAccountHolder() {
		return accountHolder;
	}
	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}
	
	/***********************************************************/
	// Member methods
	/***********************************************************/
	
	// withdraw - subtract from balance
	
	public int withdraw(int amtToWithdraw) {
		balance -= amtToWithdraw;
		return balance;
	}
	
	// deposit - add to balance
	
	public int deposit(int amtToDeposit) {
		balance += amtToDeposit;
		return balance;
	}
	
	
}
