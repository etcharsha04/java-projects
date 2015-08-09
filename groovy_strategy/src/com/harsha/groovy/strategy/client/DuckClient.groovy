package com.harsha.groovy.strategy.client

import com.harsha.groovy.strategy.Duck
import com.harsha.groovy.strategy.MallardDuck
import com.harsha.groovy.strategy.RubberDuck
import com.harsha.groovy.strategy.WoodenDuck
import com.harsha.groovy.strategy.behaviors.FlyNoWay
import com.harsha.groovy.strategy.behaviors.FlyWithWings

class DuckClient {

	static void main(def args){
		
		Duck duck = new MallardDuck(flyBehaviors:new FlyWithWings())
		duck.display()
		duck.swim()
		duck.flyBehaviors.fly()
		
		println()
		
		duck = new RubberDuck(flyBehaviors: new FlyNoWay())
		duck.display()
		duck.swim()
		duck.flyBehaviors.fly()
		
		println()
		
		duck = new WoodenDuck(flyBehaviors:new FlyNoWay())
		duck.dispaly()
		duck.swim()
		duck.flyBehaviors.fly()
		
	}
}
