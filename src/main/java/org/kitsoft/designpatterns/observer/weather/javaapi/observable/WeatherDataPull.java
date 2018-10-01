package org.kitsoft.designpatterns.observer.weather.javaapi.observable;

import java.util.Observable;

public class WeatherDataPull extends Observable {
	private float degree, humidity, pressure, windSpeed;
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float d, float h, float p, float w) {
		degree = d;
		humidity = h;
		pressure = p;
		windSpeed = w;
		
		measurementsChanged();
	}
	
	public float getDegree() {
		return degree;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
	
	public float getWindSpeed() {
		return windSpeed;
	}
}
