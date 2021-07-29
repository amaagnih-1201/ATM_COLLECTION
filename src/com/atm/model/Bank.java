package com.atm.model;

public class Bank {

	private String bankName;
	private String customerName;
	private String cardNumber;
	private double balance;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	public Bank(String bankName, String customerName, String cardNumber, double balance) {
		super();
		this.bankName = bankName;
		this.customerName = customerName;
		this.cardNumber = cardNumber;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", customerName=" + customerName + ", cardNumber=" + cardNumber
				+ ", balance=" + balance + "]";
	}
	
	
}
