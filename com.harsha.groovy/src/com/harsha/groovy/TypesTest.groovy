package com.harsha.groovy

class TypesTest {
	
	static void main(def args){
		int i = 1
		int j = i + 3
		int k = i.plus(4)
		
		println 'i: '+i
		println 'j: '+j
		println 'k: '+k
		
		println '---------------------------------'
		
		println 'i: '+i.class
		println 'j: '+j.class
		println 'k: '+k.class
		
		println '----------------------------------'
		
		// Automatic Type assignments
		def myFloat = 1.0F
		println 'myFloat Type: '+myFloat.class
		def myInteger = 1
		println 'myInteger: '+myInteger.class
		
		myInteger = myInteger / 2
		
		println 'myInterger: '+myInteger
		println 'myInteger: '+myInteger.class
		
		myFloat.times {println 'test'}
		
		2.times {println 'Two'}
		
		println '2 - 1 : '+2.previous()		
		
		println '2 + 1: '+2.next()
		
		println '2 power 3: '+2.power(3)
		
		
		for (a in 0..9){
			println ("Hello $a")
		}
		
		assert 'B'..'E' == ['B','C','D','E']
		
		
	}

}
