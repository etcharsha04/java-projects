package com.harsha.strategy.v2;

public class PintailDuck extends Duck implements Quackable, Flyable{
	
	public void fly(){
		System.out.println("Hurray!!!... I am flying");
	}
	
	public void quack(){
		System.out.println("quack... quack...");
	}
	
	public void display(){
		System.out.println("I am  PintailDuck...");
	}

}
