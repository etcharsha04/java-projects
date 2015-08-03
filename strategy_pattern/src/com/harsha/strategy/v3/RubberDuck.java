package com.harsha.strategy.v3;

import com.harsha.strategy.v3.behaviors.FlyNoWay;
import com.harsha.strategy.v3.behaviors.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck(){
		this.setFlyBehavior(new FlyNoWay());
		this.setQuackBeharior(new Squeak());
	}
	
	public void display(){
		System.out.println("I am a rubber duck");
	}
}
