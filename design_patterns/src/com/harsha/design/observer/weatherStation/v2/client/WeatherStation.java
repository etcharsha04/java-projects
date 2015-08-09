package com.harsha.design.observer.weatherStation.v2.client;

import com.harsha.design.observer.weatherStation.v2.impls.CurrentConditionsDisplay;
import com.harsha.design.observer.weatherStation.v2.impls.ForecastDisplay;
import com.harsha.design.observer.weatherStation.v2.impls.StatisticsDisplay;
import com.harsha.design.observer.weatherStation.v2.impls.WeatherData;
import com.harsha.design.observer.weatherStation.v2.interfaces.Observer;

public class WeatherStation {

	public static void main(String[] args){
		
		WeatherData weatherData = new WeatherData();
		
		Observer currentConditions = new CurrentConditionsDisplay(weatherData);
		Observer statistics = new StatisticsDisplay(weatherData);
		Observer forecast = new ForecastDisplay(weatherData);
		
		weatherData.setTemperature(80);
		weatherData.setHumidity(65);
		weatherData.setPressure(30.4f);
		
		weatherData.measurementsChanged();
		System.out.println();
		
		weatherData.setTemperature(80);
		weatherData.setHumidity(70);
		weatherData.setPressure(29.2f);
		
		weatherData.measurementsChanged();
		System.out.println();
		
		weatherData.setTemperature(78);
		weatherData.setHumidity(90);
		weatherData.setPressure(29.2f);
		
		weatherData.measurementsChanged();
		System.out.println();
		
		
		
	}
}
