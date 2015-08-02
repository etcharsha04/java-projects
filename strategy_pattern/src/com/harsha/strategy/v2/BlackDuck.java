package com.harsha.strategy.v2;

public class BlackDuck extends Duck implements Quackable, Flyable{

	public void fly(String name){
		System.out.println(name+", Hurray!!!... I am flying... ");
	}
	
	public void quack(String sound){
		System.out.println(sound+"..."+sound+"...");
	}
	
	public void display(){
		System.out.println("I am  BlackDuck...");
	}
}
