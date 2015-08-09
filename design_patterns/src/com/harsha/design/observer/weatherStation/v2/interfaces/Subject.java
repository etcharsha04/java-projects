package com.harsha.design.observer.weatherStation.v2.interfaces;

public interface Subject {

	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
