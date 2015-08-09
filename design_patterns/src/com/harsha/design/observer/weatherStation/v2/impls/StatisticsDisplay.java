package com.harsha.design.observer.weatherStation.v2.impls;

import com.harsha.design.observer.weatherStation.v2.interfaces.DisplayElement;
import com.harsha.design.observer.weatherStation.v2.interfaces.Observer;
import com.harsha.design.observer.weatherStation.v2.interfaces.Subject;

public class StatisticsDisplay implements DisplayElement, Observer {

	private float temp;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		
		display();
		
	}

	@Override
	public void display() {
		
		System.out.println("Statistics Conditions: "+temp+" F degrees, "+
				humidity+" % humidity, "+
				pressure + " barometric pressure");
	}

}
