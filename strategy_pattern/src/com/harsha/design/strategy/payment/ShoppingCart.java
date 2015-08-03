package com.harsha.design.strategy.payment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items;
	
	public ShoppingCart(){
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
	
	public void pay(PaymentStrategy paymentStrategy){
		int amount = calculateTotal();
		paymentStrategy.pay(amount);
	}
	
}
