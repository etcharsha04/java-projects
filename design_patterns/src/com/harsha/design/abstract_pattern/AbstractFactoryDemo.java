package com.harsha.design.abstract_pattern;

public class AbstractFactoryDemo {

	public static void main(String[] arg){
		
		Factory factory = new FactoryProducer().getFactory(AbstractFactoryEnum.SHAPEFACTORY);
		Shape shape = null;
		Color color = null;
		
		if(factory instanceof ShapeFactory){
			shape = ((ShapeFactory) factory).getShapeObject(ShapeEnum.CIRCLE);
			shape.draw();
			
			shape = ((ShapeFactory) factory).getShapeObject(ShapeEnum.RECTANGLE);
			shape.draw();
			
			shape = ((ShapeFactory) factory).getShapeObject(ShapeEnum.TRIANGLE);
			shape.draw();
			
		}
		
		Utility.println("");
		factory = new FactoryProducer().getFactory(AbstractFactoryEnum.COLORFACTORY);
		
		if(factory instanceof ColorFactory){
			color = ((ColorFactory) factory).getColor(ColorEnum.RED);
			color.fill();
			
			color = ((ColorFactory) factory).getColor(ColorEnum.BLUE);
			color.fill();
			
			color = ((ColorFactory) factory).getColor(ColorEnum.GREEN);
			color.fill();
			
		}
	}
}
