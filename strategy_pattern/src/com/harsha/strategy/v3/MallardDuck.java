package com.harsha.strategy.v3;

import com.harsha.strategy.v3.behaviors.FlyBehavior;
import com.harsha.strategy.v3.behaviors.FlyWithWings;
import com.harsha.strategy.v3.behaviors.Quack;
import com.harsha.strategy.v3.behaviors.QuackBehavior;

public class MallardDuck extends Duck {

	public MallardDuck(){
		this.setFlyBehavior(new FlyWithWings());
		this.setQuackBeharior(new Quack());
	}
	public void display(){
		println("I am MallardDuck...");
	}
	
}
