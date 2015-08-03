package com.harsha.design.strategy.payment;

public class Item {
	
	private String itemCode;
	private int price;
	
	public Item(String itemCode, int price) {
		super();
		this.itemCode = itemCode;
		this.price = price;
	}

	public String getItemCode() {
		return itemCode;
	}

	public int getPrice() {
		return price;
	}

}
