package com.harsha.design.observer.weatherStation.v2.impls;

import java.util.ArrayList;
import java.util.List;

import com.harsha.design.observer.weatherStation.v2.interfaces.Observer;
import com.harsha.design.observer.weatherStation.v2.interfaces.Subject;

public class WeatherData implements Subject{
	
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		
		int index = observers.indexOf(o);
		
		if(index >= 0)
			observers.remove(o);
		
	}
	
	public void notifyObservers(){
		
		for(int i = 0; i < observers.size(); i++){
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged(){
		notifyObservers();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
	
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	public List<Observer> getObservers() {
		return observers;
	}
	

}
