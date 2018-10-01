package org.kitsoft.designpatterns.observer.weather.push.observer;

import org.kitsoft.designpatterns.observer.weather.push.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElementImp {
	float degree, humidity, pressures, windSpeed;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
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
}
