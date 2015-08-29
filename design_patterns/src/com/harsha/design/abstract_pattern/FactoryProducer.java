package com.harsha.design.abstract_pattern;

public class FactoryProducer implements AbstractFactory{

	private Factory factory;
	
	@Override
	public Factory getFactory(AbstractFactoryEnum factoryType) {
		
		if(factoryType == null){
			factory = null;
		}else if(factoryType == AbstractFactoryEnum.COLORFACTORY){
			//Utility.println("ColorFactory object");
			factory = new ColorFactory();
		}else if(factoryType == AbstractFactoryEnum.SHAPEFACTORY){
			//Utility.println("ShapeFactory Object");
			factory = new ShapeFactory();
		}
		
		return factory;
	}


}
