package com.harsha.design.strategy.payment;

public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCardStrategy(String name, String cardNumber, String cvv,
			String dateOfExpiry) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}
	
	public void pay(int amount){
		System.out.println(amount+" payed through Credit Card!	");
	}
	
	
}
