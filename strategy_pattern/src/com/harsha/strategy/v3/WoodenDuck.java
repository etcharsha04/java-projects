package com.harsha.strategy.v3;

import com.harsha.strategy.v3.behaviors.FlyNoWay;
import com.harsha.strategy.v3.behaviors.Silent;

public class WoodenDuck extends Duck {

	public WoodenDuck(){
		this.setFlyBehavior(new FlyNoWay());
		this.setQuackBeharior(new Silent());
	}
	
	public void display(){
		System.out.println("I am a WoodenDuck...");
	}
}
