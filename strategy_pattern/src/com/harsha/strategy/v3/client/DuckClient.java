package com.harsha.strategy.v3.client;

import com.harsha.strategy.v3.Duck;
import com.harsha.strategy.v3.MallardDuck;
import com.harsha.strategy.v3.RedheadDuck;
import com.harsha.strategy.v3.RubberDuck;
import com.harsha.strategy.v3.WoodenDuck;
import com.harsha.strategy.v3.behaviors.FlyWithWings;

public class DuckClient {

	public static void main(String[] args) {
		
		Duck duck = new MallardDuck();
		
		duck.display();
		duck.swim();	
		duck.performFly();
		duck.performQuack();
		
		System.out.println("------------------------------------");
		
		duck = new RedheadDuck();
		duck.display();
		duck.swim();	
		duck.performFly();
		duck.performQuack();
		
		System.out.println("------------------------------------");
		
		duck = new RubberDuck();
		duck.display();
		duck.swim();	
		duck.performFly();
		duck.performQuack();
		
		System.out.println("------------------------------------");
		
		duck = new WoodenDuck();
		duck.display();
		duck.swim();	
		duck.performFly();
		duck.performQuack();
		
		System.out.println("------------------------------------");
		

	}

}
