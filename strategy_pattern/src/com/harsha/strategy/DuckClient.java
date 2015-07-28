package com.harsha.strategy;

public class DuckClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duck duck = new MallardDuck();
		duck.display();
		duck.quack();
		duck.swim();
		duck.fly();
		
		System.out.println("--------------------------------------");
		
		duck = new RedheadDuck();
		duck.display();
		duck.quack();
		duck.swim();
		duck.fly();
		
		System.out.println("--------------------------------------");
		
		duck = new WoodenDuck();
		duck.display();
		duck.quack();
		duck.swim();
		// But wooden ducks should not fly. By adding fly() method in Parent class, wooden duck inherited fly() method.
		duck.fly();
		
		System.out.println("--------------------------------------");
		
	}

}
