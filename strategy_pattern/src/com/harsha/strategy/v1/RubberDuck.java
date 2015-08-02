package com.harsha.strategy.v1;

public class RubberDuck extends Duck {

	public void quack(){
		System.out.println("I squeak instead of quack...");
	}
	
	public void display(){
		System.out.println("I am a rubber duck");
	}
}
