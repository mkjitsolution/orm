package com.mkj.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Opportunity {
	
	@Id
	private int accountNumber;
	private String clientName;
	private int amount;
	
	public Opportunity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Opportunity( String clientName, int amount) {
		super();
		this.clientName = clientName;
		this.amount = amount;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Opportunity [accountNumber=" + accountNumber + ", clientName=" + clientName + ", amount=" + amount
				+ "]";
	}
	
	
	

}
