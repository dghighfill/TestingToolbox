package com.toolbox;

import java.util.List;

public class Customer {
	private String name;
	private Bank bank;
	private List<Account> accounts;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void addAccount(Account account){
		
	}
	public void removeAccount(Account account){
		
	}
	
}
