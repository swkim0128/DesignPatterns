package org.kitsoft.designpatterns.observer.weather.push.subject;

import java.util.ArrayList;

import org.kitsoft.designpatterns.observer.weather.push.observer.Observer;

public class WeatherData implements Subject {
	private float degree, humidity, pressures, windSpeed;
	private ArrayList<Observer> observers;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void setMeasurements(float d, float h, float p, float w) {
		degree = d;
		humidity = h;
		pressures = p;
		windSpeed = w;
		
		measurementsChanged();
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}

	public void notifyObservers() {
		for(Observer o : observers)
			o.update(degree, humidity, pressures, windSpeed);
	}
}
