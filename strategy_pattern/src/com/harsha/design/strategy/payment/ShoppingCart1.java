package com.harsha.design.strategy.payment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart1 {

	private PaymentStrategy paymentStrategy;
	private List<Item> items;
	
	public ShoppingCart1(){
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public void removeItem(Item item){
		items.remove(item);
	}
	
	private int calculateTotal(){
		int sum = 0;
		
		for(Item item: items)
			sum += item.getPrice();
		
		return sum;
	}
	
	public void performPayment(){
		int amount = calculateTotal();
		
		// Delegating the work to the appropriate Payment Method.
		paymentStrategy.pay(amount);
		
	}

	public PaymentStrategy getPaymentStrategy() {
		return paymentStrategy;
	}

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}	
	
}
