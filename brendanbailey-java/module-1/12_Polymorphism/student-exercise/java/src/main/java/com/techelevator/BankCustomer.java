package com.techelevator;

import java.util.ArrayList;
import java.util.List;

/**
 * BankCustomer
 */
public class BankCustomer {

	private String name;
	private String address;
	private String phoneNumber;
	private List<Accountable> accounts = new ArrayList<>();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Accountable[] getAccounts() {
		return accounts.toArray(new Accountable[accounts.size()]);
	}

	public void addAccount(Accountable newAccount) {	
	}


	public boolean isVip() {
		// combined account balances (credits minus debts) are at least $25000 are vip
		for // loop
		return true; /* if sum of all accounts belonging to customer is at least
					  *	25000 and false otherwise
					  */
	}
	




}