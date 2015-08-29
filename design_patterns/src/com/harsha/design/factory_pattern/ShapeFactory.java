package com.harsha.design.factory_pattern;

public class ShapeFactory {

	private ShapeObject shapeObject = new ShapeObject();
	
	public Shape getShape(ShapeEnum shapeType){
		
		return shapeObject.getShapeObject(shapeType);
		
	}
	
}
