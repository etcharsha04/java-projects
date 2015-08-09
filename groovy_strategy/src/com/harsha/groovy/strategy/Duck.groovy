package com.harsha.groovy.strategy

class Duck {

	com.harsha.groovy.strategy.behaviors.FlyBehaviors flyBehaviors;
	
	void swim(){
		println 'I am swimming'
	}
	
	void display(){
		println 'I am a dummy duck'
	}
}
