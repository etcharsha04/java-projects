package com.harsha.design.observer.weatherStation.v1;

public class WeatherData {
	
	private float temparature;
	private float humidity;
	private float pressure;
	private CurrentConditionsDisplay currentConditionsDisplay;
	private ForecastDisplay forecastDisplay;
	private StatisticsDisplay statisticsDisplay;
	
	public float getTemparature(){
		return this.temparature;
	}

	public float getHumidity(){
		return this.humidity;
	}
	
	public float getPressure(){
		return this.pressure;
	}
	
	public void measurementsChanged(){
		final float temp = getTemparature();
		final float humidity = getHumidity();
		final float pressure = getPressure();
		
		currentConditionsDisplay.update(temp, humidity, pressure);
		statisticsDisplay.update(temp, humidity, pressure);
		forecastDisplay.update(temp, humidity, pressure);
		
		
	}
}

