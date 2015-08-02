package com.harsha.strategy.v2;

public class Duck {
	
	private String name;
	private String sound;
	
	/*public void quack(){
		System.out.println("Quack... Quack...");
	}*/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public void swim(){
		System.out.println("I am swimming ...");
	}
	
	public void display(){
		System.out.println("This is dummy duck...");
	}
	
	/*public void fly(){
		System.out.println("I am flying... hurray...");
	}*/

}
