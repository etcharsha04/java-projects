package com.harsha.strategy.v3.behaviors;

public class Silent implements QuackBehavior {

	public void quack(){
		System.out.println("I can't quack... I am silent");
	}
}
