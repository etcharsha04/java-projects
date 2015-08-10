package com.harsha.tests.datatypes

class ListMapTests {

	static void main(def args){
		
		List ints = [1,2,3,4]
		
		println ints.get(0)
		println ints.get(1)
		println ints.get(2)
		println ints.get(3)
		
		Person harsha = new Person('Harsha', 'Narayana')
		Person suhas = new Person('Suhas','Narayana')
		Person sumithra = new Person('Sumithra', 'Murugan')
		
		ints[0] = harsha
		
		println 'First Name: '+ints.get(0).firstName
		println 'Last Name: '+ints.get(0).lastName
		
		List<Person> persons = new ArrayList<Person>()
		
		persons[0] = harsha
		persons[1] = suhas
		persons[2] = sumithra
		
		println 'Number of persons: '+persons.size()
		println 'First Name: '+persons.get(0).getFirstName()
		println 'Last Name: '+persons.get(0).getLastName()
		
		println 'First Name: '+persons.get(1).getFirstName()
		println 'Last Name: '+persons.get(1).getLastName()
	
		println 'First Name: '+persons.get(2).getFirstName()
		println 'Last Name: '+persons.get(2).getLastName()
		
	}
	
}
