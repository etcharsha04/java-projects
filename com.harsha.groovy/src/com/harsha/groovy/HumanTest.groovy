package com.harsha.groovy

class HumanTest {

	static void main(def args){
		
		Human human = new Human() // default constructor
		
		human.setFirstName("Harsha")
		human.setLastName("Narayana")
		human.setGender("Male")
		
		
		println("First Name: "+human.getFirstName())
		println("Last Name: "+human.getLastName())
		println("Gender: "+human.getGender())
		
		
		println()
		
		println "First Name: "+human.firstName
		println "Last Name: "+human.lastName
		println "Gender: "+human.gender
		
		println()
		
		// Using the constructor with field variables - map based constructor.
		// constructor with named parameter.
		human = new Human(firstName:'Suhas', lastName:'Narayana', gender:'Male')
		
		println("First Name: "+human.getFirstName())
		println("Last Name: "+human.getLastName())
		println("Gender: "+human.getGender())
		
		
		println()
		
		println "First Name: "+human.firstName
		println "Last Name: "+human.lastName
		println "Gender: "+human.gender
		
		println()
		
		//println 'First Name: '+human[firstName]
		
		HumanJava humanJava = new HumanJava(firstName: 'Sumithra', lastName:'Murugan', gender:'Female')
		
		println 'FirstName: '+humanJava.firstName
		println 'Last Name: '+humanJava.lastName
		println 'Gender: '+humanJava.gender
		
		
		Human human1 = new Human(firstName:'Suhas', lastName:'Narayana', gender:'Male')
		Human human2 = human
		
		println()
		println 'are human and humanJava objects equal? '+(human.firstName == human1.firstName)
		println()
		println 'Are human and human1 objects equal? '+human.is(human2)
		
		println()
		human.sayHello(human.firstName+' '+human.lastName)
		println()
		human.sayHello(human1.firstName)
		println()
		
		human.defaultParams('Suhas')
		
		human.defaultParams('Suhas', 'Harsha')
		
		human.defaultParams('Suhas', 'Harsha', 'Narayana')
		
	}
}
