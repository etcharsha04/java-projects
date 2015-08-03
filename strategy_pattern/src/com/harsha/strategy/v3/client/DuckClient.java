package com.harsha.strategy.v3.client;

import com.harsha.strategy.v3.Duck;
import com.harsha.strategy.v3.MallardDuck;
import com.harsha.strategy.v3.RedheadDuck;
import com.harsha.strategy.v3.RubberDuck;
import com.harsha.strategy.v3.WoodenDuck;
import com.harsha.strategy.v3.behaviors.FlyNoWay;
import com.harsha.strategy.v3.behaviors.FlyWithWings;
import com.harsha.strategy.v3.behaviors.Silent;

public class DuckClient {

	public static void main(String[] args) {
		
		Duck duck = new MallardDuck();
		
		duck.display();
		duck.swim();	
		duck.performFly();
		duck.performQuack();
		
		System.out.println("------------------------------------");
		
		// Dynamically changing the behavior of MallardDuck.
		duck.display();
		duck.swim();
		
		// Dynamically changing the fly behavior of MallardDuck.
		duck.setFlyBehavior(new FlyNoWay());
		duck.performFly();
		
		//Dynamically changing the quack behavior of MallardDuck.
		duck.setQuackBeharior(new Silent());
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
