package org.kitsoft.designpatterns.observer.weather.push.observer;

import org.kitsoft.designpatterns.observer.weather.push.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElementImp {
	private float degree, humidity, pressures, windSpeed;

	@SuppressWarnings("unused")
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float d, float h, float p, float w) {
		degree = d;
		humidity = h;
		pressures = p;
		windSpeed = w;
	}
	
	public void display() {
		System.out.println("Current conditions : " + degree
				+ "F degree and " + humidity + "% humidity");
	}
	
	public float getDegree() {
		return degree;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressures() {
		return pressures;
	}
	
	public float getWindSpeed() {
		return windSpeed;
	}
	
}
