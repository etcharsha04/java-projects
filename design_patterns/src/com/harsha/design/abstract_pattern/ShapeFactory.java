package com.harsha.design.abstract_pattern;

public class ShapeFactory implements Factory{

	private Shape shape;
	
	public Shape getShapeObject(ShapeEnum shapeType){
		
		if(shapeType == null){
			shape = null;
		}else if(shapeType == ShapeEnum.CIRCLE){
			shape = new Circle();
			//Utility.println("ShapeFactory: Circle Object!!");
		}else if(shapeType == ShapeEnum.RECTANGLE){
			shape = (Shape) new Rectangle();
		}else if(shapeType == ShapeEnum.TRIANGLE){
			shape = (Shape) new Triangle();
		}
		
		return shape;
	}
}
