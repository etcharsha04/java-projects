package com.harsha.design.abstract_pattern;

public interface AbstractFactory extends Factory{

	public Factory getFactory(AbstractFactoryEnum factoryType);
	
}
