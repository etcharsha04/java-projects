package com.harsha.groovy

class Human {

	String firstName;
	String lastName;
	String gender;
	
	void sayHello(String name){
		println 'Hello '+name+' !!'
	}
	
	void sayHello(def firstName, def lastName = 'Narayana'){
		println 'Hello '+firstName+' '+lastName
	}

	void defaultParams(def firstParam, def secondParam = 'Sumithra', def thirdParam = 'Murugan'){
		println 'Params: '+firstParam+' '+secondParam+' '+thirdParam
	}
}
