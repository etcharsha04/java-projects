package com.harsha.strategy.v3;

import com.harsha.strategy.v3.behaviors.FlyWithWings;
import com.harsha.strategy.v3.behaviors.Quack;

public class RedheadDuck extends Duck {

	public RedheadDuck(){
		this.setFlyBehavior(new FlyWithWings());
		this.setQuackBeharior(new Quack());
	}
	
	public void display(){
		println("I am a RedheadDuck ...");
	}
}
