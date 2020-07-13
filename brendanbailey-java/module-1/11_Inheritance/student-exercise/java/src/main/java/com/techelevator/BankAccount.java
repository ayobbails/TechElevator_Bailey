package com.techelevator;

public class BankAccount {
	
	// Class member data - attributes of a class object
	private String accountHolderName;
	private String accountNumber;
	private int balance;
	
	// Constructor(s) for the class
	public BankAccount(String accountHolderName, String accountNumber) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	
	public BankAccount(String accountHolderName, String accountNumber, int balance) {
		/* 
		 * A new bank account requires an account holder name and account number. 
		 * 
		 * The balance is initialized to the dollar balance given 
		 *
		 * */
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		}
	
	// Getters and Setters
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}
	
	public int deposit(int amountToDeposit) {
		balance = balance + amountToDeposit;
		return balance;	
	}
	
	public int withdraw(int amountToWithdraw) {
		balance = balance - amountToWithdraw;
		return balance;
	}	
}
