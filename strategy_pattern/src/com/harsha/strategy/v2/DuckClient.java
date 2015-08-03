package com.harsha.strategy.v2;

public class DuckClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MallardDuck duck = new MallardDuck();
		duck.display();
		duck.quack(new String("quack quack"));
		duck.swim();
		duck.fly(new String("MallardDuck"));
		
		System.out.println("--------------------------------------");
		
		RedheadDuck duck1 = new RedheadDuck();
		duck1.display();
		
		duck1.quack("Quack Quack");
		duck1.swim();
		duck1.fly("RedheadDuck");
		
		System.out.println("--------------------------------------");
		
		WoodenDuck duck2 = new WoodenDuck();
		duck2.display();
		//duck2.quack();  WoodenDuck does not implement Quackable and Flyable interfaces.
		duck2.swim();
		// But wooden ducks should not fly. By adding fly() method in Parent class, wooden duck inherited fly() method.
		//duck2.fly();
		
		System.out.println("--------------------------------------");
		
	}

}
