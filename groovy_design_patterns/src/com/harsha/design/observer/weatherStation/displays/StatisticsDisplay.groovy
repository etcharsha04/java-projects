package com.harsha.design.observer.weatherStation.displays

import com.harsha.design.observer.weatherStation.interfaces.DisplayElement
import com.harsha.design.observer.weatherStation.interfaces.Observer;
import com.harsha.design.observer.weatherStation.interfaces.Subject;
import com.harsha.design.observer.weatherStation.subject.WeatherData;

class StatisticsDisplay implements Observer, DisplayElement {

	WeatherData weatherData
	float temp
	float humidity
	float pressure
	
	StatisticsDisplay(Subject weatherData){
		this.weatherData = weatherData
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		println 'Statistics Conditions: '+temp+" F degrees "+humidity+' % humid '+pressure+' barometric pressure'
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp = temp
		this.humidity = humidity
		this.pressure = pressure
		
		display()
		
	}

}
