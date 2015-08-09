package com.harsha.design.observer.weatherStation.clients

import com.harsha.design.observer.weatherStation.displays.CurrentConditionsDisplay
import com.harsha.design.observer.weatherStation.displays.ForecastDisplay
import com.harsha.design.observer.weatherStation.displays.StatisticsDisplay
import com.harsha.design.observer.weatherStation.subject.WeatherData
import com.harsha.design.observer.weatherStation.interfaces.Observer

class WeatherStationClient {

	static void main(def args){
		
		WeatherData weatherData = new WeatherData()
		Observer currentConditions = new CurrentConditionsDisplay(weatherData)
		Observer forecast = new ForecastDisplay(weatherData)
		Observer statistics = new StatisticsDisplay(weatherData)
		
		weatherData.setTemp(80);
		weatherData.setHumidity(65);
		weatherData.setPressure(30.4f);
		
		weatherData.measurementsChanged();
		println();
		
		weatherData.setTemp(80);
		weatherData.setHumidity(70);
		weatherData.setPressure(29.2f);
		
		weatherData.measurementsChanged();
		println();
		
		weatherData.setTemp(78);
		weatherData.setHumidity(90);
		weatherData.setPressure(29.2f);
		
		weatherData.measurementsChanged();
		println();
		
	}
}
