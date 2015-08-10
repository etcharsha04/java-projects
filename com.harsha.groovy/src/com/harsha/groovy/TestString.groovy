package com.harsha.groovy

class TestString {
	
	static void main(def args){
		
		def name = "John"
		def s1 = "Hello $name"
		def s2 = 'Hello $name'
		
		println 'Name: '+name
		println 'String1: '+s1 
		println 'String2: '+ s2
		
		println s1.class
		println s2.class
		
		def date = new Date()
		
		// GStrings allow variable substitutions and method calls
		println "We met on $date"
		println "we met on ${date.format('MM/dd/yy')}"
		
		def s = s1.tokenize()
		
		println s
		
	}

}
