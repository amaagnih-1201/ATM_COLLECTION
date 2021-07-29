package com.atm.model;

public class CardDetails {

	private String cardNumber;
	private String pinNumber;
	private String cardType;
	private double withdrawAmount;
	private String bankDetails;
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	
	public String getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(String bankDetails) {
		this.bankDetails = bankDetails;
	}
	public CardDetails() {
		// TODO Auto-generated constructor stub
	}
	public CardDetails(String cardNumber, String pinNumber, String cardType, double withdrawAmount,
			String bankDetails) {
		super();
		this.cardNumber = cardNumber;
		this.pinNumber = pinNumber;
		this.cardType = cardType;
		this.withdrawAmount = withdrawAmount;
		this.bankDetails = bankDetails;
	}
	@Override
	public String toString() {
		return "CardDetails [cardNumber=" + cardNumber + ", pinNumber=" + pinNumber + ", cardType=" + cardType
				+ ", withdrawAmount=" + withdrawAmount + ", bankDetails=" + bankDetails + "]";
	}


	
	
}
