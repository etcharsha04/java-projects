package com.harsha.design.strategy.payment;

public class ShoppingCartTest {

	public static void main(String[] args) {
		
		PaymentStrategy paymentStrategy = new CreditCardStrategy("Harsha", "12345", "123", "08/03");
		Item item1 = new Item("1234", 10);
		Item item2 = new Item("2345", 20);
		
		ShoppingCart sc = new ShoppingCart();
		sc.addItem(item1);
		sc.addItem(item2);
		
		ShoppingCart1 sc1 = new ShoppingCart1();
		sc1.addItem(item1);
		sc1.addItem(item2);
		
		sc.pay(paymentStrategy);
		
		sc1.setPaymentStrategy(paymentStrategy);
		sc1.performPayment();
		
		paymentStrategy = new PaypalStrategy("suhas@gmail.com","23456");
		sc.pay(paymentStrategy);
		
		sc1.setPaymentStrategy(paymentStrategy);
		sc1.performPayment();
		


	}

}
