package com.harsha.design.observer.weatherStation.v2.impls;

import com.harsha.design.observer.weatherStation.v2.interfaces.DisplayElement;
import com.harsha.design.observer.weatherStation.v2.interfaces.Observer;
import com.harsha.design.observer.weatherStation.v2.interfaces.Subject;

public class ForecastDisplay implements DisplayElement, Observer {

	private float temp;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public ForecastDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this); 
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		
		display();
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Forecast Conditions: "+(temp+0.1)+" F degrees, "+
				(humidity+0.2)+" % humidity, "+
				(pressure+0.1) + " barometric pressure");
		
	}

}
