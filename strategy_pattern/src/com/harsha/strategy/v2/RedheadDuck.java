package com.harsha.strategy.v2;

public class RedheadDuck extends Duck implements Quackable, Flyable{

	public void RedheadDuck(){
		System.out.println("I am RedheadDuck ...");
	}
	
	// Duplicate code in both MallardDuck and RedheadDuck.
	public void fly(){
		System.out.println("Hurray!!!... I am flying");
	}
	
	public void quack(){
		System.out.println("quack... quack...");
	}
}
