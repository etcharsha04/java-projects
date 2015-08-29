package com.harsha.design.factory_pattern;

public class ShapeObject {

	private Shape shape;
	
	public Shape getShapeObject(ShapeEnum shapeType){
		
		if(shapeType == null){
			shape = null;
		}else if(shapeType == ShapeEnum.CIRCLE){
			shape = new Circle();
		}else if(shapeType == ShapeEnum.RECTANGLE){
			shape = new Rectangle();
		}else if(shapeType == ShapeEnum.TRIANGLE){
			shape = new Triangle();
		}
		
		return shape;
	}
}
