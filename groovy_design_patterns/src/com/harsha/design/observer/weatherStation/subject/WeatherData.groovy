package com.harsha.design.observer.weatherStation.subject

import com.harsha.design.observer.weatherStation.interfaces.Observer;
import com.harsha.design.observer.weatherStation.interfaces.Subject

class WeatherData implements Subject {

	List<Observer> observers;
	float temp;
	float humidity;
	float pressure;
	
	WeatherData(){
		observers = new ArrayList<Observer>()
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		
		int index = observers.indexOf(o);
		
		if(index >= 0)
			observers.remove(index)
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i = 0; i < observers.size(); i++){
			Observer observer = observers.get(i);
			observer.update(this.temp, this.humidity, this.pressure)
		}
	}
	
	void measurementsChanged(){
		notifyObservers();
	}

}
