package com.harsha.groovy.strategy.behaviors

class FlyNoWay implements FlyBehaviors {

	void fly(){
		println 'I cant fly as I am not a real duck...'
	}
}
