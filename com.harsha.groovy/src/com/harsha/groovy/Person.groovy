package com.harsha.groovy

class Person {

	String firstName
	String lastName
	
	static void main(def args){
		
		Person p = new Person()
		p.firstName = "Harsha"
		p.lastName = "Narayana"
		
		println p.getFirstName() + " " + p.getLastName()
		
		Person p1 = new Person(firstName:"Suhas", lastName:"Narayana");
		println p1.getFirstName() + " " + p1.getLastName()
		
		p1.setFirstName("Sumithra")
		p1.setLastName("Murugan")
		
		println p1.getFirstName() + " " + p1.getLastName()
	}
}
