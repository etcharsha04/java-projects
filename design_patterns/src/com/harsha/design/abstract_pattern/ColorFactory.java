package com.harsha.design.abstract_pattern;

public class ColorFactory implements Factory{

	private Color color;
	
	public Color getColor(ColorEnum colorType){
		
		if(colorType == null){
			color = null;
		}else if(colorType == ColorEnum.BLUE){
			color = new Blue();
		}else if(colorType == ColorEnum.RED){
			color = new Red();
		}else if(colorType == ColorEnum.GREEN){
			color = new Green();
		}
		
		return color;
	}
}
