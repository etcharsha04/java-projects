package com.harsha.groovy

class TestTest {

	static main(args) {
	
		Task task  = new Task()
		task.setName("Harsha")
		println task.getName()
		
		task.setDescription("This is just a description")
		println task.getDescription()
		
		task.setDueDate(new Date())
		println task.getDueDate();
		
		println ""
		
		println task.name
		println task.description
		println task.dueDate
		
		println ''
		
		println task.getCity()
		println task.setCity("San Jose")
	}

}
