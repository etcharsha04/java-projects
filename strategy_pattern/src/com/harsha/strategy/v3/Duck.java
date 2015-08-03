package com.harsha.strategy.v3;

import com.harsha.strategy.v3.behaviors.FlyBehavior;
import com.harsha.strategy.v3.behaviors.QuackBehavior;

public class Duck {
	
	private QuackBehavior quackBeharior;
	private FlyBehavior flyBehavior;
	
	public QuackBehavior getQuackBeharior() {
		return quackBeharior;
	}

	public void setQuackBeharior(QuackBehavior quackBeharior) {
		this.quackBeharior = quackBeharior;
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void swim(){
		System.out.println("I am swimming ...");
	}
	
	public void display(){
		System.out.println("I am a dummy duck...");
	}
	
	public static void println(String s){
		System.out.println(s);
	}

}
